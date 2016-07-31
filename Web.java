package com.New;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Web {
	private static String Mail;

	public static String getMail() {
		return Mail;
	}

	public static void setMail(String mail) {
		Mail = mail;
	}

	public static String getPass() {
		return Pass;
	}

	public static void setPass(String pass) {
		Pass = pass;
	}

	private static String Pass;

	public void apache() throws Exception {
		File file = new File("C:\\Users\\Kiran\\Desktop\\basic test case.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet Sheet1 = workbook.getSheet("Sheet3");
		Mail = Sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(Mail);
		Pass = Sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(Pass);
	}
}
