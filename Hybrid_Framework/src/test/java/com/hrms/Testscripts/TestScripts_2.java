package com.hrms.Testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Login;
import com.hrms.pages.Logout;

public class TestScripts_2 {

	//	public static void main(String[] args) throws Exception {

	@Test
	public void TestCases()throws Exception  {
		{


			Login log=new Login();
			Logout ll=new Logout();
			log.startup();
			log.UserLogin();
			ll.teardown();


		}

	}

}
