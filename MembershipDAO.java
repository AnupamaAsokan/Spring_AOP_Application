package com.luv2code.aopapp.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public String addMembershipDetails() {
		System.out.println("Membership DAO: " + getClass());
		return "Done";
	}	
	
	public String updateMembershipDetails() {
		System.out.println("updating!!!: ");
		return "Done";
	}
}
