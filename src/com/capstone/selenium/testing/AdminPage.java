package com.capstone.selenium.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminPage {
WebDriver driver;
	
@BeforeClass
public void testSetup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KEDARNATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.edge.driver","J:\\SIMPLILEARN\\SOFTWARES\\SELENIUM JAR FILES\\SELENIUM SETUP\\edgedriver_win64\\msedgedriver.exe");
	driver = new ChromeDriver();
	//WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

	
	
	@Test(priority = 1)
	public void login() {
		driver.get("http://localhost:8080/Capstone_Project/admin-login.jsp");
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("upass")).sendKeys("java@1991");
		driver.findElement(By.name("vercode")).sendKeys("16237");
		driver.findElement(By.cssSelector("body > div.content-wrapper > div > div:nth-child(2) > div:nth-child(2) > div > div.panel-body > form > input.btn.btn-primary")).submit();
	}
	@Test(priority = 2)
	public void viewproducts() {
		
		
		driver.findElement(By.cssSelector("#menu-top > li.open > ul > li:nth-child(1) > a")).click();
	}
	@Test(priority = 2)
	public void vieworders() {
		
		
		driver.findElement(By.cssSelector("#menu-top > li.open > ul > li:nth-child(2) > a")).click();
	}
	
	
}
