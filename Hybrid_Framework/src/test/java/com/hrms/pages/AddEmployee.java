package com.hrms.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.hrms.utility.Log;


public class AddEmployee {

	public static By pim=By.linkText("PIM");
	public static By addEmp=By.linkText("Add Employee") ;
	public static By lastName=By.name("txtEmpLastName");
	public static By firstName=By.name("txtEmpFirstName");
	public static String frames="rightMenu";
	public static By photoupload=By.id("photofile");
	public static By saveAction=By.id("btnEdit");
	


	public static Actions act;

	@Test(description = "pimFunctionality")
	public static void pimFunctionality() {

		WebElement pim_action=Login.driver.findElement(pim);
		act=new Actions(Login.driver);
		act.moveToElement(pim_action).build().perform();
		System.out.println("Pim Functionality working");
		Log.info("Pim Functionality working");

	}
	@Test(dependsOnMethods = "pimFunctionality")
	public static void addEmployee() throws Exception {
		Thread.sleep(3000);
		WebElement add_emplyeeDetails=Login.driver.findElement(addEmp);
		add_emplyeeDetails.click();
		Log.info("Add Employee");
	}
	@Test(dependsOnMethods = "addEmployee")
	public static void addingEmployeeDetails() throws Exception {
		Login.driver.switchTo().frame(frames);
		WebElement lastNameTextbox=Login.driver.findElement(lastName);
		lastNameTextbox.sendKeys(Login.prop.getProperty("LastName"));
		
		WebElement fastNameTextbox=Login.driver.findElement(firstName);
		fastNameTextbox.sendKeys(Login.prop.getProperty("FirstName"));
		
		Thread.sleep(3000);
		WebElement photoFile=Login.driver.findElement(photoupload);
		photoFile.sendKeys("D:\\Classes & Docs\\Java Programms\\Hybrid_Framework\\FileUpload\\Mahesh.jpg");
		
		WebElement saveButton=Login.driver.findElement(saveAction);
		saveButton.click();
				
		Login.driver.switchTo().defaultContent();
		Log.info("Employee Details added successfully");
		Log.info("Photo upload successfully");
	}

}
