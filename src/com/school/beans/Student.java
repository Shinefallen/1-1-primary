package com.school.beans;

public class Student {
	
	private Integer id;
	private String name;
	private int age;
	private double score;
	
	//无参构造器
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//带参构造器
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	//Set、Get方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	//重写toString方法
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
