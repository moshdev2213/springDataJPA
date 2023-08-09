package com.example.datajpa.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.datajpa.entity.Course;
import com.example.datajpa.entity.CourseMaterial;
@SpringBootTest
class CourseMaterialRepoTest {

	@Autowired
	private CourseMaterialRepo courseMaterialRepo;
	
	
	@Test
	public void saveCourseMaterial() {
		
		Course course = 
				Course.builder()
					.title("DSA")
					.credit(6)
					.build();
		
		CourseMaterial courseMaterial = 
				CourseMaterial.builder()
					.url("google.com")
					.course(course)
					.build();
		
		courseMaterialRepo.save(courseMaterial);
	}
	
	@Test 
	public void printAllCourseMaterials() {
		List<CourseMaterial> courseMaterials = courseMaterialRepo.findAll();
		System.out.println(courseMaterials);
	}

}
