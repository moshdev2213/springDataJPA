package com.example.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa.entity.CourseMaterial;
@Repository
public interface CourseMaterialRepo extends JpaRepository<CourseMaterial, Long>{

}
