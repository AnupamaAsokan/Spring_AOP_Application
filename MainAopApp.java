package com.luv2code.aopapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopapp.dao.AccountDAO;
import com.luv2code.aopapp.dao.MembershipDAO;

/**
 * @author anupama
 * 
 */
public class MainAopApp {

	public static void main(String[] args) {

		// read the spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// get the AccountDAObean from the container
		AccountDAO theAccountDAO = context.getBean("accountDAO",
				AccountDAO.class);
		
		// get the MembershipDAObean from the container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO",
				MembershipDAO.class);

		// call the business method
		Account myAccount = new Account();
		theAccountDAO.addAcount(myAccount, true);
		theAccountDAO.updateAccount();
		
		theMembershipDAO.addMembershipDetails();
		theMembershipDAO.updateMembershipDetails();
		
		// close the context
		context.close();
	}

}
