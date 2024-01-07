package com.coderscampus.assignment4;

public class StudentService {

	public Student createStudent(String line) {
		Student student = new Student();
		student.setStudentId(Integer.parseInt(line.split(",")[0]));
		student.setStudentName(line.split(",")[1]);
		student.setCourse(line.split(",")[2]);
		student.setGrade(Integer.parseInt(line.split(",")[3]));
		return student;
	}

	public Student[] SortCompSci(Student[] students) {
		Student[] compSci = new Student[34];
		int i = 0;
		for (Student student:students) {
			if(student.getCourse().contains("COMPSCI")) {
				compSci[i++] = new Student(student.getStudentId(), student.getStudentName(), student.getCourse(), student.getGrade());
			}
		}
		return compSci;
	}
	
	public Student[] SortStat(Student[] students) {
		Student[] stat = new Student[33];
		int i = 0;
		for (Student student:students) {
			if(student.getCourse().contains("STAT")) {
				stat[i++] = new Student(student.getStudentId(), student.getStudentName(), student.getCourse(), student.getGrade());
			}
		}
		return stat;
	}
	
	public Student[] SortApMath(Student[] students) {
		Student[] apMath = new Student[33];
		int i = 0;
		for (Student student:students) {
			if(student.getCourse().contains("APMATH")) {
				apMath[i++] = new Student(student.getStudentId(), student.getStudentName(), student.getCourse(), student.getGrade());
			}
		}
		return apMath;
	}
	
	public String WriteStudent(Student student) {
		return student.getStudentId() + "," + student.getStudentName() + "," + student.getCourse() + "," + student.getGrade() + "\n";
	}
	
	
}
