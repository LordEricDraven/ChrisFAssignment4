package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileService {
	StudentService studentService = new StudentService();
	
	public Student[] readFile() throws FileNotFoundException, IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("student-master-list.csv"))){
			reader.readLine();
			Student[] students = new Student[100];
			for (int i = 0; i<100; i++) {
				String line = reader.readLine();
				students[i] = studentService.createStudent(line);
			}
			Arrays.sort(students);
			return students;
		}
	}
	
	public void writeFile(Student[] students, String fileName) throws FileNotFoundException, IOException {
		try (BufferedWriter writer =  new BufferedWriter(new FileWriter(fileName))){
			writer.write("Student ID, Student Name, Course, Grade\n");
			for(Student student : students) {
				writer.write(studentService.WriteStudent(student));
			}
		}
	}
	
	
}
