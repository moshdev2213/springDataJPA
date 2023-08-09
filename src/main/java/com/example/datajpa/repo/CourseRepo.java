package com.example.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa.entity.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

}
