package com.mproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
public static void main(String[] args) throws Throwable {
	try {
		
	System.out.println("Creating excel data ");
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Projects_TestNg\\DataDriven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet createSheet = wb.createSheet("Emp Details");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	Sheet sheet = wb.getSheet("Emp Details");
	
	createCell.setCellValue("User Data");
	wb.getSheet("Emp Details").getRow(0).createCell(1).setCellValue("user password");
	wb.getSheet("Emp Details").getRow(0).createCell(2).setCellValue("Mail ID");
	wb.getSheet("Emp Details").getRow(0).createCell(3).setCellValue("Mail Name");
	wb.getSheet("Emp Details").createRow(1).createCell(0).setCellValue("Ganesh");
	wb.getSheet("Emp Details").getRow(1).createCell(1).setCellValue("123@jkh");
	wb.getSheet("Emp Details").createRow(2).createCell(0).setCellValue("Selvam");
	wb.getSheet("Emp Details").getRow(2).createCell(1).setCellValue("123455125@jkh");
	wb.getSheet("Emp Details").getRow(0).createCell(2).setCellValue("Mail ID");
	wb.getSheet("Emp Details").getRow(1).createCell(1).setCellValue("123@jkh");
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("created");
	} catch (Exception e) {
e.printStackTrace();
	}
	
	}
}
