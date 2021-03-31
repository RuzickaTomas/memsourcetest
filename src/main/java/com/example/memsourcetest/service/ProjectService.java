package com.example.memsourcetest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.memsourcetest.entity.MemUser;
import com.example.memsourcetest.rest.Project;
import com.example.memsourcetest.rest.ProjectResponse;

@Service
public class ProjectService {

	@Value("${memsource.endpoint}")
	private String endpoint;
	
	@Autowired
	private MemUserService memUserService;
	
	private static final String PROJECTS ="/projects";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Project> projects(String username) {
		if (username != null) {
			UriComponentsBuilder builder  = UriComponentsBuilder.fromHttpUrl(endpoint + PROJECTS);
			MemUser memUser = memUserService.getByUsername(username);
			builder.queryParam("token", memUser.getToken());
			ProjectResponse projects = restTemplate.getForObject(builder.toUriString(), ProjectResponse.class);
			return (List<Project>) projects.getContent();
		}
		return new ArrayList<Project>();
	}
	
}
