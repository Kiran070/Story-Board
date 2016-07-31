package com.New;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-2.53.0\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//*[@id='widget_row']/div[1]/div/div[2]/ul/li[2]/a")).click();
		/*Actions clicker = new Actions(driver);
	    clicker.sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(1000);
	    WebElement button = null;
		clicker.click(button).perform();     
	    Thread.sleep(1000);
	*/
		
	}

}
