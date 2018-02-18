package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	@Test
	public void Login() {

	
		System.setProperty("webdriver.chrome.driver","/Users/pal/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
	    driver.get("facebook.com");
	    
	    
	    
	    WebElement newele = driver.findElement(By.id("email")).click();
	    newele.sendKeys("swappal@gmail.com");
	    
	    driver.findElement(By.id("pass")).click();
	    newele.sendkeys("Silverspoon@20008");
	   
	    driver.findElement(By.value("Log In")).click
	    driver.findElement(By.
	
	    try {
	    Thread.sleep(20000);
		driver.findElement(By.xpath("//a/span[contains(text(),'Swappal'"));  //CHECK XPATH
	    driver.findElement(By.xpath("//div[contains text(),'Swappal Binakar']"));//chekck
	    }
	    catch(Exception){
	    	System.out.println("fields on login page not found");
	    	
	    }
	    
	    
	    
	    
	}
	

}