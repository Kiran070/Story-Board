package com.New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-2.53.0\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 * driver.findElement(By.xpath("//a[@value='DHM']")).click();
		 * 
		 * Select dropdown = new Select(driver.findElement(By.xpath(
		 * "//*[@id='ctl00_mainContent_ddl_Adult']")));
		 * dropdown.selectByIndex(0); dropdown.selectByValue("5");
		 * dropdown.selectByVisibleText("4 Adults");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		// driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		// driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//List<WebElement> radio = driver.findElements(By.xpath("//input[@name='group2']"));
		
	int count = driver.findElements(By.xpath("//input[@name='group2']")).size();
	for(int i=0;i<count;i++){
		//driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
		String text = (driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value"));
		if(text.equals("Beer"))
		{
			driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
		}
		//System.out.println(radio.size()); // prints the number of elements with the same group name
		
		
		//for(int i=0;i<radio.size();i++){ //loop for clicking on three radio buttons
			//radio.get(i).click();
			//radio.get(i).getAttribute("value");
			//Thread.sleep(1000);
		}
	
	}

}
