package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Register, Long > {
	@Query("SELECT u FROM Register u WHERE u.email = ?1")
	Register findByEmail(String email);
}