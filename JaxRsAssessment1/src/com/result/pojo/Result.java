package com.result.pojo;

public class Result {

	int id;
	String name;
    int score;
    String status;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int id, String name, int score, String status) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.status = status;
	}
	
	
	 
	


}
