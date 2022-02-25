package com.OnlineBanking.dao;

import java.util.Collection;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OnlineBanking.model.Savingaccount;

@Repository

public interface SavingaccountRepository extends JpaRepository<Savingaccount ,Integer>  {
//	@Query("SELECT e FROM Employee e WHERE e.status =?1") JPQL
//	Collection<Employee> findAllActiveEmployees();
	
}


