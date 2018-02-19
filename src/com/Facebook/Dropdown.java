package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public void dropDownTest() {
	System.setProperty("webdriver.chrome.driver","/Users/pal/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("facebook.com");
	
	WebElement dropdownMonth = driver.findElement(By.name("birthday_month"));
	
	Select findbirthday = new Select(dropdownMonth);
	
	findbirthday.selectByVisibleText("May");
	
	
	/////
	
	
WebElement dropdownMonth = driver.findElement(By.id("day"));
	
	Select findbirthday = new Select(dropdownMonth);
	
	findbirthday.selectByVisibleText("May");
	
	
	
	}
	
}
