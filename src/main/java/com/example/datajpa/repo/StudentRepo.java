package com.example.datajpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.datajpa.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
	
	public List<Student> findByFname(String fname);
	
	public List<Student> findByFnameContaining(String name);
	
	public List<Student> findByGuardianName(String name);
	
	public List<Student> findByFnameAndLname(String fname,String lname);
	
	//JPQL queries
	/*the query is not like the natuve sql here table names are not used 
	rather class name with its attributes are used*/
	@Query("select s from Student s where s.email=?1")
	Student getStudentByEmailAddress(String EmailId);
	
	
	//default query annotations
	@Query(
			value = "SELECT * FROM tbl_student s WHERE s.email=?1",
			nativeQuery = true
	)
	Student getStudentByEmailAddressNAtive(String email);
	
	//default query with params
	@Query(
			value = "SELECT * FROM tbl_student s WHERE s.email=:emailId",
			nativeQuery = true
	)
	Student getStudentByEmailAddressNAtiveParams(@Param("emailId") String emailId);
	
	@Modifying
	@Transactional
	@Query(
			value = "UPDATE tbl_student set fname=?1 where email=?2",
			nativeQuery = true
	)
	int updateStudentNameByEmailId(String fname,String emailId) ;

}
