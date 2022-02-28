package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;
    
    @Test
    public void testCreateUser() {
    Register user = new Register();
    user.setEid(10);
    user.setName("sai");
    user.setEmail("sai@gmail.com");
    user.setUname("saik");
    user.setPass("1234");
    user.setRole("admin");
    
Register savedUser = repo.save(user);
    
Register existUser = entityManager.find(Register.class, savedUser.getEid());
    
    assertThat(existUser.getEmail()).isEqualTo(user.getEmail());;
    
    }
    
    @Test
    public void testFindUserByEmail() {
    	String email = "sai123@gmail.com";
    	
    	Register user = repo.findByEmail(email);
    	
    	assertThat(user).isNotNull();
    }
}
