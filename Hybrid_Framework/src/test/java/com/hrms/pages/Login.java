package com.hrms.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.utility.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static By textUserName=By.name("txtUserName");
	public static By textpassword=By.name("txtPassword");
	public static By buttonLogin=By.name("Submit");
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeClass
	public static void startup() throws Exception {
		prop=new Properties();
		InputStream is=new FileInputStream("D:\\Classes & Docs\\Java Programms\\Hybrid_Framework\\Config files\\config.properties");
		prop.load(is);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(prop.getProperty("Url"));
		System.out.println(prop.getProperty("Browser"));
		System.out.println("Succseefully application open");
		Log.info("Succseefully application open");
	}
	
	@Test(dependsOnMethods = "startup")
	public static void UserLogin() {
		driver.findElement(textUserName).sendKeys(prop.getProperty("UserName"));
		driver.findElement(textpassword).sendKeys(prop.getProperty("Password"));
		driver.findElement(buttonLogin).click();
		System.out.println("USer login details is verified");
		Log.info("USer login details is verified");

}
}
