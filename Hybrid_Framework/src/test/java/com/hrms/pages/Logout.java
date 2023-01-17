package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.hrms.utility.Log;


public class Logout {
	
	public static By logout=By.linkText("Logout");
	
	@Test(dependsOnMethods = "UserLogin")
	public static void USerLogout() {
		
		Login.driver.findElement(logout).click();
		System.out.println("User hits on logout action");
	    Log.info("User hits on logout action");
	    
	    Reporter.log("User hits on logout action");
		
	}
	
	@AfterClass
	public static void teardown() {
		
		Login.driver.close();
		System.out.println("Session teriminated");
		Log.info("Session teriminated");
		
	}

}
