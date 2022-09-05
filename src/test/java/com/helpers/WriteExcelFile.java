package com.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {
	
	public static void writeCellValue(String filepath, String sheetName, int rowNumber, int cellNumber, String resultText) throws IOException {
		
		File file = new File(filepath);

		FileInputStream inputStream = new FileInputStream(file);

		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);

		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		XSSFRow row = newSheet.getRow(rowNumber);
		
//		XSSFCell firtscell = row.getCell(cellNumber - 1);
//		
//		System.out.println("firts cell value is = " + firtscell.toString());
		
		XSSFCell nextcell = row.createCell(cellNumber);
		nextcell.setCellValue(resultText);
		
		System.out.println("Next cell value = " + nextcell.toString());
		
		inputStream.close();
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		newWorkbook.write(outputStream);
		
		outputStream.close();
		
	}

}
