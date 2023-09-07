package com.upendra.InputAllocation.Login;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;

	public Map<String, Object> loginPage(String username,String password) {
		int a = loginRepository.loginPage(username, password);
		Map<String, Object> map = new HashMap<>();
		System.out.println("Returns"+" "+a);
		try {
		if (a == 1) {
			map.put("Status", loginRepository.loginPage(username, password));
			map.put("Message", "Login of " + username + " is Successfull");
		} else {
			map.put("Status","0");
			map.put("Message", "Invalid,Username or password");
		}
		}
		catch(Exception e) {
			map.put("Message", "Error Occured while Login");
			map.put("Flag", false);
		}
		return map;

	}

}
