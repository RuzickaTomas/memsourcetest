package com.example.memsourcetest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.memsourcetest.entity.MemUser;

@Repository
public interface MemUsersRepo extends JpaRepository<MemUser, Long> {
	MemUser findByUsername(String username);
}
