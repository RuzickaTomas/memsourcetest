package com.example.memsourcetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.memsourcetest.entity.MemUser;
import com.example.memsourcetest.rest.UserInfo;
import com.example.memsourcetest.rest.UserResponse;

@Service
public class LoginService {

	@Value("${memsource.endpoint}")
	private String endpoint;
	
	private static final String LOGIN ="/auth/login";
	
	@Autowired
	private MemUserService memUserService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public UserResponse login(UserInfo user) {
		
		UserResponse response = restTemplate.postForObject(endpoint + LOGIN , user, UserResponse.class);
		MemUser u = new MemUser();
		
		u.setId(Long.valueOf(response.getUser().getId()));
		u.setToken(response.getToken());
		u.setUsername(response.getUser().getUserName());
		u.setExpires(response.getExpires());
		memUserService.update(u);
		
		return response;
	}
}
