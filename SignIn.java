package com.New;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn {

	public static void main(String[] args) throws IOException {
		 FileInputStream fis;
		 XSSFWorkbook wb;
         XSSFSheet sh;
         WebDriver driver = new FirefoxDriver();
		int fRow;
		int lRow;
		int rCount;
		int colCount;
		fis = new FileInputStream("C:\\Users\\Kiran\\Desktop\\basic test case.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet("Sheet3");
		fRow = sh.getFirstRowNum();
		lRow = sh.getLastRowNum();
		rCount =lRow-fRow;
		colCount = sh.getRow(0).getLastCellNum();
		for(int rNum=2;rNum<rCount;rNum++){
			for(int cNum=0;cNum<colCount;cNum++){
				System.out.println();
			}
		
		 
		
			
			
		}
		
		
		

	
	
		// TODO Auto-generated method stub
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).click();

		driver.findElement(By.xpath("//*[@id='ap_password']")).click();
		driver.findElement(By.id("signInSubmit")).click();
	}

}
