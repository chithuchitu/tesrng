package org.testngrevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test(invocationCount=3,threadPoolSize=2)
	// intentially pass the failed  exception(expectedExceptions= {NoSuchElementException.class})
	
	public  void googleSearch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q1")).sendKeys("Greens",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
