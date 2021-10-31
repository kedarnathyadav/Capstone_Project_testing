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




	@Test
	public void google() throws IOException {
	

		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KEDARNATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","J:\\SIMPLILEARN\\SOFTWARES\\SELENIUM JAR FILES\\SELENIUM SETUP\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
		driver.get("http://localhost:8080/Capstone_Project/customer-login.jsp");
		driver.findElement(By.name("email")).sendKeys("kadamk33@gmail.com");
		driver.findElement(By.name("password")).sendKeys("java@1991");
		driver.findElement(By.className("sign-in")).submit();
		// click on the profile icon
		//driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a")).click();
		// click on the sign out
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//WebElement Test = wait
				//.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign out')]")));
		//Test.click();
		// driver.quit();
	}

	


	
}

