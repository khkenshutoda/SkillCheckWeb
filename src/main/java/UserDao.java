import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends DBAccess {
	public String getName(String id,String pass) {
		String sql = "select name from user where id = ? and pass= ?";
		String name = null;
		ResultSet rs = null;

		try {
			connect();
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1,id);
			ps.setString(2,pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return name;
	}
	
	public int getDep(String Id) {
		String sql = "select dep from user where id=?";
		int id = 0;
		ResultSet rs = null;

		try {
			connect();
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1,Id);
			rs = ps.executeQuery();
			while (rs.next()) {
				id= rs.getInt("dep");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return id;
	}
	
	public String getDName(int id) {
		String sql = "select name from dep where id = ? ";
		String name = null;
		ResultSet rs = null;
		try {
			connect();
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			while (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return name;
	}
	
	public String getAName(String id) {
		String sql = "select dep.name from user inner join dep on user.dep=dep.id where user.id=?";
		String name = null;
		ResultSet rs = null;
		try {
			connect();
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1,id);
			rs = ps.executeQuery();
			while (rs.next()) {
				name = rs.getString("dep.name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return name;
	}
}