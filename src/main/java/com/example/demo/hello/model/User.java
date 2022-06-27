package com.example.demo.hello.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")//DB内のテーブルの指定
public class User{
	
	@Id //主キーであることを示す。
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主キー生成に使用する戦略
	@Column(name = "user_id")//カラム名の指定
	public int user_id;
	
	@Column(name = "user_name")
	public String user_name;

	@Column(name = "department")
	public String department;
  
	public int getUserId() {
	    return this.user_id;
	}

	public void setUserId(int user_id) {
	    this.user_id = user_id;
	}
	
	
	public String getUserNaem() {
	    return this.user_name;
	}
	
	public void setUserName(String user_name) {
	    this.user_name = user_name;
	}
	
	public String getDepartment() {
	    return this.department;
	}
	
	public void setDepartment(String department) {
	    this.department = department;
	}
 
}
