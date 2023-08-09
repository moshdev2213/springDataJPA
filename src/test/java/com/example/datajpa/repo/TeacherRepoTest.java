package com.example.datajpa.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.datajpa.entity.Course;
import com.example.datajpa.entity.Teacher;
@SpringBootTest
class TeacherRepoTest {

	@Autowired
	private TeacherRepo teacherRepo;
	
	@Test
	public void saveTeacher() {
		
		Course courseDSB = Course.builder()
				.title("DSB")
				.credit(4)
				.build();
		Course courseDSDB = Course.builder()
				.title("DSDB")
				.credit(4)
				.build();
		
		Teacher teacher = 
				Teacher.builder()
					.firstName("suranagana")
					.lastName("welupillai")
//					.course(List.of(courseDSB,courseDSDB))
					.build();
		
		teacherRepo.save(teacher);
	}

}
