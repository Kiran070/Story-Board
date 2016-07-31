package com.New;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Data {
	public static FileInputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       System.out.println(values(3,3));
     //System.out.println(cell.getStringCellValue());
     
	}
	
    public static String values(int rw, int cl) throws IOException{
    	 file = new FileInputStream("C:\\Users\\Kiran\\Desktop\\basic test case.xlsx");
         wb = new XSSFWorkbook(file);
         sheet = wb.getSheet("Sheet1");
         row = sheet.getRow(rw);
        
         cell= row.getCell(cl);
         return cell.getStringCellValue();
         }
}
