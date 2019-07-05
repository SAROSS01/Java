package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB implements DAO<Stuffy>{

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/stuffy";
		String username = "stuffy_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl,username,pwd);
		return conn;
	}
	@Override
	public Stuffy get(int id) {
		String sql = "SELECT * FROM stuffy" + "WHERE ID = ?"; 
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1,  id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int id1 = rs.getInt("ID");
				String type = rs.getString("Type");
				
				Stuffy p = new Stuffy();
				return p;
			}
			else {
				rs.close();
				return null;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Stuffy> getAll() {
		String sql = "SELECT ID, Type, Color, Size, Limbs " +
					"From Stuffy";
				
		List<Stuffy> stuffies = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String type = rs.getString("Type");
				String color = rs.getString("color");
				String size = rs.getString("size");
				int limbs = rs.getInt("limbs");
				Stuffy p = new Stuffy(id,type,color,size,limbs);
				stuffies.add(p);
				
			}
		} 
		catch (SQLException e) {
			System.err.println(e);
			stuffies = null;
		}
		return stuffies;
		
	}

	@Override l = "INSERT INTO Product (Code,Description, Price) " +
						"VALUES (?,?,?)";
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, t.getCode5rd());
			ps.setString(2, t.getDescription());
			ps.setDouble(3, t.getPrice());
			ps.executeUpdate();
			return true;
		}
		catch (SQLException e) {
			System.err.println(e);
			return false;
		}
				
				
		
	}

	@Override
	public boolean update(Product t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Product t) {
		String sql = "delete from product" + 
						"where code = ?";
		try(Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, t.getDescription());
			ps.setDouble(2, t.getPrice());
			ps.setString(3, t.getCode());
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

}

