package com.luv2code.aopapp.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopapp.Account;

@Component
public class AccountDAO {

	public void addAcount(Account account, boolean vipFlag) {
		System.out.println("Class Name: " + getClass());
	}
	
	public boolean updateAccount() {
		System.out.println("Updating!!!: ");
		return true;
	}
}
