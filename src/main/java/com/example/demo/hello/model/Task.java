package com.example.demo.hello.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")//DB内のテーブルの指定
public class Task{
	
	@Id //主キーであることを示す。
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主キー生成に使用する戦略
	@Column(name = "task_id")//カラム名の指定
	public int task_id;
	
	@Column(name = "user_id")
	public int user_id;

	@Column(name = "task_name")
	public String task_name;

	@Column(name = "status")
	public String status;
	
	@Column(name = "deadline")
	public String deadline;
	
	public int getTaskId() {
	    return this.task_id;
	}

	public void setTaskId(int task_id) {
	    this.task_id = task_id;
	}
	
	public int getUserId() {
	    return this.user_id;
	}

	public void setUserId(int user_id) {
	    this.user_id = user_id;
	}
	
	
	public String getTaskNaem() {
	    return this.task_name;
	}
	
	public void setTaskName(String task_name) {
	    this.task_name = task_name;
	}
	
	public String getStatus() {
	    return this.status;
	}
	
	public void setStatus(String status) {
	    this.status = status;
	}
	public String getDeadline() {
	    return this.deadline;
	}
	
	public void setDeadline(String deadline) {
	    this.deadline = deadline;
	}
}


