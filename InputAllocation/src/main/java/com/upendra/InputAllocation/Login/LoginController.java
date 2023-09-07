package com.upendra.InputAllocation.Login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	@PostMapping(value = "/login", consumes = "multipart/form-data", produces = "application/json")
	public Map<String, Object> loginPage(@RequestParam String username, @RequestParam String password) {
		return loginService.loginPage(username, password);
	}
}
