package com.example.demo.hello.controller;
  
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hello.model.Task;
import com.example.demo.hello.service.TaskService;



  
@RestController
@RequestMapping("/api")
public class TaskController {
        @Autowired
        TaskService taskService;
        
        
        
        @RequestMapping(value="/tasks", method=RequestMethod.GET)
        public List<Task> readtasks() {
        	
        	 List<Task> test = new ArrayList<>();
             
             Task task1 = new Task();
             task1.setTaskId(1);
             task1.setUserId(1);
             task1.setTaskName("make slides");
             task1.setStatus("not yet");
             task1.setDeadline("2022-09-30");
             
             test.add(task1);
             
            return test;
        }
        
        @RequestMapping(value="/tasks", method=RequestMethod.POST)
        public String createtasks(int user_id, String task_name, String status, String deadline) {
        	
        	 Task task0 = new Task();
        	 
        	 
             
            return "task is created";
        }
        
        
  
}