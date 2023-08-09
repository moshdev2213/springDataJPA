package com.example.datajpa.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.datajpa.entity.Course;
import com.example.datajpa.entity.Student;
import com.example.datajpa.entity.Teacher;
@SpringBootTest
class CourseRepoTest {

	@Autowired
	private CourseRepo courseRepo;
	
	@Test
	public void printCourses() {
		List<Course> courses = courseRepo.findAll();
		System.out.println(courses);
	}
	
	@Test
	public void saveCourseWithTeacher() {
		
		Teacher teacher = 
				Teacher.builder()
					.firstName("Priyanka")
					.lastName("singhh")
					.build();
		
		Course course = 
				Course.builder()
					.title("Python")
					.credit(4)
					.teacher(teacher)
					.build();
		
		courseRepo.save(course);
	}
	
	@Test
	public void saveCourseWithStudentAndTeacher() {
		Teacher teacher = Teacher.builder()
				.firstName("shaskiri")
				.lastName("morgan")
				.build();
		
		Course course = Course.builder()
				.title("AI")
				.credit(88)
				.teacher(teacher)
				.build();
		
		Student student =Student.builder()
				.fname("Abhiske")
				.lname("Singh")
				.email("abio@gmail.com")
				.build();
		
		course.addStudent(student);
		
		courseRepo.save(course);
	}

}
