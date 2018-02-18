package com.Facebook;

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
	    driver.get("facebook.com");
	    
	    driver.findElement(By.id("email")).sendKeys("swapal1982@gmail.com");
	    
	    
	    
	   
	    
	   WebElement elePass = driver.findElement(By.id("pass"));
	   elePass.click();
	   elePass.sendKeys("Silverspoon@20008");
	   
	    driver.findElement(By.xpath("//input[(@value='Log In')")).click();
	    
	
	    
	    Thread.sleep(20000);
		driver.findElement(By.xpath("//a/span[contains(text(),'Swappal'"));  //CHECK XPATH
	    driver.findElement(By.xpath("//div[contains text(),'Swappal Binakar']"));//chekck
	    
	 
	    Assert.assertEquals("Swappal Binakar", driver.getTitle()); 
	    
	    Assert.assertEquals("https://www.facebook.com/swappal.binakar.7", driver.getCurrentUrl());
	   
	    
	    
	}
	

}