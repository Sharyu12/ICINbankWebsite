package com.OnlineBanking.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OnlineBanking.model.Loanrequest;

@Repository
public interface LoanrequestRepository extends JpaRepository<Loanrequest ,Integer>  {

//	@Query("SELECT e FROM Employee e WHERE e.status =?1") JPQL
//	Collection<Employee> findAllActiveEmployees();
	
}
