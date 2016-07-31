package com.New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium-2.53.0\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//*[@id='widget_row']/div[1]/div/div[2]/ul/li[2]/a")).click();//
		
		System.out.println("Before Cliciking Multicity");
		System.out.println(driver.findElement(By.xpath("//*[@id='return_date_sec']/span[3]")).isDisplayed());
		System.out.println("After clicking the multicity button");
		driver.findElement(By.xpath("//*[@id='multi_city_button']/span")).click();
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='return_date_sec']/span[3]")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[2]/div/ul/li[5]/span/a")).click();
		//driver.findElement(By.xpath("//a[@title=['PAYBACK']")).click();
	}

}
