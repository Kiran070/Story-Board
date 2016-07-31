package com.New;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelData {
	static XSSFSheet sh;
	static XSSFRow row;
	static XSSFWorkbook wb;
	static String val;

	public static void main(String[] args) throws IOException {

		/*
		 * WebDriver driver = new FirefoxDriver();
		 * driver.get("https://www.amazon.com/");
		 * driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]"
		 * )).click();
		 * driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(val); //
		 * TODO Auto-generated method stub
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\Kiran\\Desktop\\basic test case.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet("Sheet3");

		/*
		 * XSSFCell cell = row.getCell(1); String value =
		 * cell.getStringCellValue(); System.out.println(value);
		 */

		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		//int colCount = row.getLastCellNum();
		{

			for (int r = 0; r <rowCount+1; r++) {
			 //row =	sh.getRow(r);
				XSSFRow row = sh.getRow(r);
				
				for (int c = 0; c <row.getLastCellNum(); c++) {
					
					val = sh.getRow(r).getCell(r).getStringCellValue();
					System.out.println(val);
				}
			}
			

		}
	}
}
