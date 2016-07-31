package com.New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Asserts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Gmail", title);
		driver.close();
		
		}

}
