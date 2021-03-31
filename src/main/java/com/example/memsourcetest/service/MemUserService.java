package com.example.memsourcetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.memsourcetest.entity.MemUser;
import com.example.memsourcetest.repo.MemUsersRepo;


@Service
public class MemUserService {

	@Autowired
	private MemUsersRepo memUsersRepo;
	
	@Transactional(readOnly = true)
	public List<MemUser> getAll() {
		return memUsersRepo.findAll();
	} 
	
	@Transactional(readOnly = true)
	public MemUser getById(Long id) {
		return memUsersRepo.getOne(id);
	}

	@Transactional(readOnly = true)
	public MemUser getByUsername(String username) {
		return memUsersRepo.findByUsername(username);
	}
	
	
	@Transactional
	public MemUser create(MemUser user) {
		return memUsersRepo.save(user);
	}
	
	
	
	@Transactional
	public MemUser update(MemUser user) {
		return memUsersRepo.saveAndFlush(user);
	}
	
	public void delete(MemUser user) {
		memUsersRepo.delete(user);
	}
	
}
