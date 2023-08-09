package com.example.datajpa.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.datajpa.entity.Course;
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

}
