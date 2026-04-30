package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("test")
class UserServiceTest {
    @Autowired
    UserService service;

    @Test
    void testSaveUser() {
        User user = new User();
        user.setName("CI Test");
        user.setEmail("sagar.s@byzan.com");

        User saved = service.save(user);

        assertNotNull(saved.getId());
    }
}
