package com.Facebook;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePage {
	
	@Test
	public void Login() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","/Users/pal/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

		driver.findElement(By.id("email")).sendKeys("swapal1982@gmail.com");


		WebElement elePass = driver.findElement(By.id("pass"));
		elePass.click();
		elePass.sendKeys("Silverspoon@20008");

		driver.findElement(By.xpath("//input[(@value='Log In')")).click();



		Thread.sleep(20000);
		driver.findElement(By.xpath("//a/span[contains(text(),'Swappal'"));  //CHECK XPATH
		driver.findElement(By.xpath("//div[contains text(),'Swappal Binakar']"));//chekck


		Assert.assertEquals(driver.getTitle(),"Swappal Binakar"); 

		Assert.assertEquals("https://www.facebook.com/swappal.binakar.7", driver.getCurrentUrl());

	}
     
	@Test
	public void invalidLogin() {
		
		System.setProperty("WebDriver.chrome.driver", "/Users/pal/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("facebook.com");
	    
	    driver.findElement(By.id("email")).sendKeys("pala");
	    
	    driver.findElement(By.id("pass")).sendKeys("asads");
	    
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    
	    driver.findElement(By.xpath("//div[contains text(), 'The email or phone number you’ve entered doesn’t match any account.']"));
		
		Assert.assertEquals(driver.getTitle(), "Log into Facebook | Facebook");
		Assert.assertEquals(driver.getCurrentUrl(), "view-source:https://www.facebook.com/login.php?login_attempt=1&lwv=110 ");
		
		
		
		
	}
	
	
	public void pwdReset() {
		
			
			System.setProperty("WebDriver.chrome.driver", "/Users/pal/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			
		    driver.get("facebook.com");
		    
		    driver.findElement(By.id("email")).sendKeys("swapal1982");
		    
		    driver.findElement(By.id("pass")).sendKeys("asads");
		    
		    driver.findElement(By.xpath("//input[@value='Log In']")).click();
		    
		    Assert.assertEquals(driver.findElements(By.xpath("//div[contains text(),'The password you’ve entered is incorrect.'")), "The password you’ve entered is incorrect. ");
		    
		    driver.findElement(By.xpath("//div/div[contains text(),'Forgot your password?']")).click();
		    
		    driver.findElement(By.xpath("//a[contains text(),'Recover Your Account']")).click();
		    
		    	
		    driver.navigate().to("gmail.com");
		    driver.findElement(By.tagName("Sign In")).click();
		    driver.findElement(By.id("identifierId")).sendKeys("swapal1982@gmail.com");
		    driver.findElement(By.xpath("//content/span[contains text(),'Next'"));
		    driver.findElement(By.name("password")).sendKeys("swap&pal@423");
		    driver.findElement(By.xpath("//content/span[contains text(),'Next'"));
		    
		    
		    
		    
		    
		    
		
		
		
	}
	
	
	
	
	

}