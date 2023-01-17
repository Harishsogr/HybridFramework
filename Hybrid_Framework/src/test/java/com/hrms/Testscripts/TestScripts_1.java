package com.hrms.Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmployee;
import com.hrms.pages.Login;
import com.hrms.pages.Logout;

public class TestScripts_1 {
	
	
	@Test
	public void openApplication() throws Exception {

//	public static void main(String[] args) throws Exception {
		
		DOMConfigurator.configure("log.xml");
		DOMConfigurator.configure("Log4j.xml");
		
		Login log=new Login();
		Logout ll=new Logout();
		AddEmployee add=new AddEmployee();
		
		log.startup();
		log.UserLogin();
		add.pimFunctionality();
		add.addEmployee();
		add.addingEmployeeDetails();
		ll.USerLogout();
		ll.teardown();
		

	}

}
