package com.prowess.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowess.university.model.Student;
@Repository
public interface StudentApiRepository extends JpaRepository<Student,Long>{

	Student findByStudentid(Long id);

}
