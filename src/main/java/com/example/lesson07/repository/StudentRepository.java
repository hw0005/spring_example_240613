package com.example.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lesson07.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	// Spring Data JPA vs 순수 JPA
	// public StudentEntity save(StudentEntity student) => create
	// public StudentEntity findById(int id) => update
	// public void delete(StudentEntity student) => delete
	// public List<StudentEntity> findAll() => select
	
	// ex02/select1 - JPQL 문법
	public List<StudentEntity> findAllByOrderByIdDesc();
	public List<StudentEntity> findTop3ByOrderByIdDesc();
	public List<StudentEntity> findByName(String name11111);
	public List<StudentEntity> findByNameIn(List<String> names);
	public List<StudentEntity> findByNameAndDreamJob(String name, String dreamJob);
	public List<StudentEntity> findByEmailContains(String keyword);
	public List<StudentEntity> findByNameStartingWith(String namekeyword);
	public List<StudentEntity> findByIdBetween(int startId, int endId);
	
}
