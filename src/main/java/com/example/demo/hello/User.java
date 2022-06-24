package com.example.demo.hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User{
	
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int user_id;
	
	@Column(length = 50, nullable = false)
	private String user_name;
	
	@Column(length = 200, nullable = true)
	private String department;
  
 
}