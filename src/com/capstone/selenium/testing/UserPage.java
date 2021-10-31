package com.capstone.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class UserPage {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\KEDARNATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.gmail.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("identifierId")).sendKeys("vpn365.0@gmail.com");
//		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("qwertyuiop0987");
//		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//		String at = driver.getTitle();
//		String et = "gmail";
//		driver.close();
//		if(at.equalsIgnoreCase(et)) {
//			System.out.println("Test Successful");
//		}
//		else {
//			System.out.println("Test Failure");
//		}
//	}
//}
	
	WebDriver driver;
	
//	@Test
//	public void startbrowser() throws IOException {
//	
//
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\KEDARNATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		//System.setProperty("webdriver.edge.driver","J:\\SIMPLILEARN\\SOFTWARES\\SELENIUM JAR FILES\\SELENIUM SETUP\\edgedriver_win64\\msedgedriver.exe");
//		driver = new ChromeDriver();
//		//WebDriver driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	
//		
//	}
	
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
		driver.get("http://localhost:8080/Capstone_Project/customer-login.jsp");
		driver.findElement(By.name("email")).sendKeys("kedarnath@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kedar");
		driver.findElement(By.className("sign-in")).submit();
	}

	@Test(priority = 2)
	public void searchProd() {
		driver.findElement(By.name("search")).sendKeys("dis");
		driver.findElement(By.className("sear-sub")).submit();
	}
	@Test(priority = 3)
	public void selectcategory() {
		driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a")).click();
		
		
	}
	
	@Test(priority = 5)
	public void CartOperations() {
		driver.findElement(By.className("total")).click();
	
	}
	
	@Test(priority = 6)
	public void paymentGateway() {
		driver.findElement(By.cssSelector("body > div.checkout > div > center:nth-child(2) > a")).click();
	}
	
	@Test(priority = 7)
	public void orderPrint() {
		driver.findElement(By.cssSelector("#exampl > center > table > tbody > tr:nth-child(2) > td:nth-child(3) > i")).click();
		
	}

	

	
}

