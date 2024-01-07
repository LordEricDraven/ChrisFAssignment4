package com.coderscampus.assignment4;

public class Student implements Comparable <Student> {

	private Integer studentId;
	private String studentName;
	private String course;
	private Integer grade;
	
	
	public Student() {
		
	}
	public Student(int studentId, String studentName, String course, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	public int compareTo(Student that) {
		if(this.grade.compareTo(that.grade) == 0) {
			return this.studentName.compareTo(that.studentName);
		}
		else {
			return that.grade.compareTo(this.grade);
		}
	}
	

	
	
	
}
