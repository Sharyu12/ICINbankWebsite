package com.OnlineBanking.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.OnlineBanking.model.deposit;

@Repository
public interface depositRepository extends JpaRepository<deposit ,Integer>{
	
}
