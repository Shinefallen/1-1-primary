package com.school.beans;

public class Student {
	
	private Integer id;
	private String name;
	private int age;
	private double score;
	
	//�޲ι�����
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//���ι�����
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	//Set��Get����
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
	//��дtoString����
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
