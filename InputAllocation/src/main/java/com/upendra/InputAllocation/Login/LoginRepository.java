package com.upendra.InputAllocation.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int loginPage(String username, String password) {

		String query = "SELECT COUNT(*) FROM user_login WHERE username COLLATE utf8_bin = ? AND password COLLATE utf8_bin = ?";
		return jdbcTemplate.queryForObject(query, Integer.class, new Object[] { username, password });

	}

}
