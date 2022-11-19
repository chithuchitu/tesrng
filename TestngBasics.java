package org.testngrevision;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngBasics {
	static WebDriver driver;
	@Test(priority =13)
	public void tc4() {
		System.out.println("priority..13");

	}
	@Test(priority=5)
	public  void tc5() {
		System.out.println("Priority.5");
 

	}
	@Test(priority=1)
	public void tc2 () {
		System.out.println("Maximixe window....");
		driver.manage().window().maximize();
	}
	@Test(priority =-1)
	public void tc1() {
		System.out.println("Launch URL....");


		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");


	}
	@Test(priority=2)
	public  void tc3() throws InterruptedException {

		System.out.println("login page.....");
		driver.findElement(By.id("email")).sendKeys("chithra@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("chithra");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		boolean page = driver.getCurrentUrl().contains("privacy_mutation_token");
		if (page==true) {
			System.out.println("invalid credential");

		} else {
			System.out.println("valid  credential");

		}

 
	}
	@AfterMethod
	public void aft() {
		System.out.println("after test acse...");
	}
	@BeforeMethod
	public void bef() {
		System.out.println("run before test case....");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("Launch Browser...");
		WebDriverManager.chromedriver().setup();
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("test case end....");

	}

}
