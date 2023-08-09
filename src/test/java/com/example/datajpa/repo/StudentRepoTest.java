package com.example.datajpa.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.datajpa.entity.Guardian;
import com.example.datajpa.entity.Student;

@SpringBootTest
class StudentRepoTest {

	@Autowired
	private StudentRepo studentRepo;
	
	@Test
	public void saveStudent() {
		Student student = Student.builder()
				.email("abc@gmail.com")
				.fname("shrade")
				.lname("kareky")
//				.gname("golaptus")
//				.gemail("golu@gmail.com")
//				.gmobile("7656432331")
				.build();
		
		studentRepo.save(student);
	}
	
	@Test
	public void saveStudentWithGuardian() {
		Guardian guardian = Guardian.builder()
				.email("guade@gmail.com")
				.name("guady")
				.mobile("0897656442")
				.build();
		
		Student student = Student.builder()
				.email("abcd@gmail.com")
				.fname("shrade")
				.lname("kareky")
				.guardian(guardian)
				.build();
		
		studentRepo.save(student);
	}
	
	@Test
	public void printAllStudent() {
		List<Student> studentList = studentRepo.findAll();
		System.out.println(studentList);
	}
	
	@Test
	public void fingByfname() {
		List<Student> students = studentRepo.findByFname("shrade");
		System.out.println(students);
	}
	
	@Test
	public void findByChar() {
		List<Student> students = studentRepo.findByFnameContaining("ade");
		System.out.println(students);
	}
	
	@Test
	public void findByGname() {
		List<Student> students = studentRepo.findByGuardianName("guady");
		System.out.println(students);
	}
	
	
	@Test
	public void findByLnameAndFname() {
		List<Student> students = studentRepo.findByFnameAndLname("shrade", "kareky");
		System.out.println(students);
	}
	
	@Test 
	public void printgetStudentByEmailAddress() {
		Student student = studentRepo.getStudentByEmailAddress("abcd@gmail.com");
		System.out.println(student);
	}
	
	@Test
	public void getStudentByEmailAddressNAtive() {
		Student student = studentRepo.getStudentByEmailAddressNAtive("abcd@gmail.com");
		System.out.println(student);
	}
	
	@Test
	public void getStudentByEmailAddressNAtiveParams() {
		Student student = studentRepo.getStudentByEmailAddressNAtive("abcd@gmail.com");
		System.out.println(student);
	}
	
	@Test
	public void updateStudentNameByEmailId() {
		studentRepo.updateStudentNameByEmailId("sharade", "abcd@gmail.com");
	}
	

}
