package com.OnlineBanking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.OnlineBanking.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
