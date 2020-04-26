package com.learnautomation.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DemoforMaven {	
	
	@Test
	public void testhello()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//this is new commit
		driver.get("http://www.learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}

}
