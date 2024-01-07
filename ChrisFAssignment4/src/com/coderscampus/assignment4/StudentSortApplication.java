package com.coderscampus.assignment4;

import java.io.FileNotFoundException;
import java.io.IOException;


public class StudentSortApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileService fileService = new FileService();
		StudentService studentService = new StudentService();
		Student[] students = fileService.readFile();
		
		fileService.writeFile(studentService.SortCompSci(students), "course1.csv");
		fileService.writeFile(studentService.SortApMath(students), "course2.csv");
		fileService.writeFile(studentService.SortStat(students),  "course3.csv");
		
	}
	
}
