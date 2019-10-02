package dao;

import entity.transaction;
import sun.rmi.runtime.Log;

import java.io.Console;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TransactionDB implements DAO<transaction>
{
    private Connection getConnection() throws SQLException
    {
        String dbUrl = "jdbc:sqlite:C:\\Users\\sr18496\\sqlite\\$.db";
        Connection connection = DriverManager.getConnection(dbUrl);
        return connection;
    }

    @Override
    public List<transaction> getAll()
    {
        String sql = "SELECT ID, SRC, USD, DUE, TYPE, CATEGORY "
                + "FROM transactions";
        List<transaction> transactions = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery())
        {
            while (rs.next())
            {
                int id = rs.getInt("ID");
                String src = rs.getString("SRC");
                BigDecimal usd = rs.getBigDecimal("USD");
                int due = rs.getInt("DUE");
                boolean type = rs.getBoolean("TYPE");
                String category = rs.getString("Category");

                transaction t = new transaction(id, src, usd, due, type, category);
                transactions.add(t);
            }
            return transactions;
        }
        catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    public transaction getById(int id) {
        String sql = "SELECT ID, SRC, USD, DUE, TYPE, CATEGORY "
                    + "FROM transactions"
                    + "WHERE ID = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String src = rs.getString("SRC");
                BigDecimal usd = rs.getBigDecimal("USD");
                int due = rs.getInt("DUE");
                boolean type = rs.getBoolean("TYPE");
                String category = rs.getString("Category");
                transaction t = new transaction(id,src,usd,due,type, category);
                rs.close();
                return t;
            } else{
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }

    }

}