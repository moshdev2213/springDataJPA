package com.example.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa.entity.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long>{

}
