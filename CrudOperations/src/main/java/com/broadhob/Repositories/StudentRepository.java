package com.broadhob.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.broadhob.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
