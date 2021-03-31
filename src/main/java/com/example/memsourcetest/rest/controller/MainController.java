package com.example.memsourcetest.rest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.memsourcetest.rest.Project;
import com.example.memsourcetest.rest.UserInfo;
import com.example.memsourcetest.rest.UserResponse;
import com.example.memsourcetest.service.LoginService;
import com.example.memsourcetest.service.ProjectService;

@RestController
public class MainController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	ProjectService projectService;
	
	
	@RequestMapping("/projects")
	public List<Project> projects(HttpSession session) {
		 String username = (String) session.getAttribute("CONTENT_RESP");
		 return projectService.projects(username);
	}
	
	
	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserResponse login(@Validated @RequestBody UserInfo user, HttpServletRequest request) {
		UserResponse userResponse = loginService.login(user);
		request.getSession().setAttribute("CONTENT_RESP", userResponse.getUser().getUserName());
		return userResponse;
	}
	

}
