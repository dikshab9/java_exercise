package org.jdbc.dao;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.jdbc.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
//		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

//	public Circle getCircle(int circleId) {
//	Connection conn=null;
//		try {
////		String driver = "com.mysql.jdbc.Driver"; 
////		Class.forName(driver).newInstance(); 
////		conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdb","username","password");
////			String url = "jdbc:mysql://localhost/testdb";
////			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
//			 conn =  (Connection) dataSource.getConnection ();
//		PreparedStatement ps=conn.prepareStatement("SELECT * FROM circle where id=?");
//        ps.setFloat(1,circleId);
//        
//        Circle circle=null;
//        ResultSet rs=ps.executeQuery();
//        if(rs.next()) {
//        	circle=new Circle(circleId,rs.getString("name"));
//        }
//        rs.close();
//        ps.close();
//        return circle;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			throw new RuntimeException(e);
//		}
//		finally {
//			try {
//				conn.close();
//			}
//			catch(SQLException e) {
//				
//			}
//		}
//		
//	}
	//public int getCircleCount() {
		//String sql="SELECT COUNT(*) FROM circle";
//		jdbcTemplate.setDataSource(getDataSource());
	////return jdbcTemplate.queryForObject(sql,Integer.class);
	//}
	public String getCircleName(int circleId) {
		String sql="SELECT NAME FROM circle WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
	}
	public Circle getCircleforId(int circleId) {
		String sql="SELECT * FROM circle WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, new CircleMapper());
	}
	
	public List<Circle> getAllCircle(){
		String sql="SELECT * FROM circle";
		return jdbcTemplate.query(sql, new CircleMapper());
	}
	
	public void insertCircle(Circle circle) {
		String sql="INSERT INTO circle (ID,NAME) VALUES (?,?)";
		jdbcTemplate.update(sql,new Object[] {circle.getId(),circle.getName()});
	}
	
	public void createTriangletable() {
		String sql="CREATE TABLE TRIANGLE(ID INTEGER,NAME VARCHAR(30))";
		jdbcTemplate.execute(sql);
	}
		private static final class CircleMapper implements RowMapper<Circle>{

			@Override
			public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				Circle circle=new Circle();
				circle.setId(resultSet.getInt("ID"));
				circle.setName(resultSet.getString("NAME"));
				return circle;
			}
			
		}

}
