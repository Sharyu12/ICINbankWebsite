package com.OnlineBanking.service;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.AdminRepository;
import com.OnlineBanking.model.Admin;


@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;

	public Admin validateUser(Admin user) {
		Admin a=adminRepository.validateUser(user.getu_name(),user.getpwd());
		
		return a;
	}
	@Transactional
	public List<Admin> fetchAdmins() {
		List<Admin> AdminList=adminRepository.findAll();
		return AdminList;
		
	}
	

}

