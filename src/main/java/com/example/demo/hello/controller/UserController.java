package com.example.demo.hello.controller;
  
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hello.model.User;
import com.example.demo.hello.service.UserService;



  
@RestController
@RequestMapping("/api")
public class UserController {
        @Autowired
        UserService UserService;
        
        
        
        @RequestMapping(value="/users", method=RequestMethod.GET)
        public List<User> readUsers() {
        	
        	 List<User> test = new ArrayList<>();
             
             User user1 = new User();
             user1.setUserId(1);
             user1.setUserName("Alice");
             user1.setDepartment("human resource");
             
             test.add(user1);
             
            return test;
        }
        
        @RequestMapping(value="/users", method=RequestMethod.POST)
        public String createUsers(String user_name, String department) {
        	
        	 User user0 = new User();
        	 user0.setUserName(user_name);
        	 user0.setDepartment(department);
        	 
             
            return "User is created";
        }
        
        
  
}