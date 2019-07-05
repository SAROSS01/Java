package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Product;

public class ProductDB implements DAO<Product>{

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/mma";
		String username = "mma_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl,username,pwd);
		return conn;
	}
	@Override
	public Product get(String code) {
		String sql = "SELECT * FROM product" + "WHERE code = ?"; 
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1,  code);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String desc = rs.getString("Description");
				double price = rs.getDouble("Price");
				Product p = new Product(code,desc,price);
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
	public List<Product> getAll() {
		String sql = "SELECT Code, Description, Price " +
					"From Product";
				
		List<Product> products = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String code = rs.getString("Code");
				String desc = rs.getString("Description");
				Double price = rs.getDouble("Price");
				Product p = new Product(code,desc,price);
				products.add(p);
				
			}
		} 
		catch (SQLException e) {
			System.err.println(e);
			products = null;
		}
		return products;
		
	}

	@Override
	public boolean add(Product t) {
		String sql = "INSERT INTO Product (Code,Description, Price) " +
						"VALUES (?,?,?)";
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, t.getCode());
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
