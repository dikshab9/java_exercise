package org.jdbc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
@Component
public class SimpleJdbcDao extends SimpleJdbcCall {
@Autowired
	public SimpleJdbcDao(DataSource dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}
	public int getCircleCount() {
		String sql="SELECT COUNT(*) FROM circle";
//		jdbcTemplate.setDataSource(getDataSource());
		return this.getJdbcTemplate().queryForObject(sql,Integer.class);
	}

}
