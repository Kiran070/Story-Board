package com.New;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetFromExcel {

	private static final String Website = null;
	private static String user = null;
private static String User;
private static String Pass;
	public static String getUser() {
		return user;
	}

	public static void setUser(String mail) {
		String User = user;
	}

	public static String getPass() {
		return pass;
	}

	public static void setPass(String pass) {
		String Pass = pass;
	}

	private static String pass;

	public void apache() throws Exception {
		File file = new File("C:\\Users\\Kiran\\Desktop\\basic test case.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet Sheet1 = workbook.getSheet("Sheet3");
		user = Sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(user);
		pass = Sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(pass);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']")).click();
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys(Website.getUser());

		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(Website.getPass());

		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		driver.close();
	}
	
