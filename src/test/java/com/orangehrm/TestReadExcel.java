package com.orangehrm;

import java.io.IOException;

import org.testng.annotations.Test;

import com.helpers.Conditions;
import com.helpers.ReadExcelFile;

public class TestReadExcel extends Conditions {

	@Test(description = "Read complete excel file")
	public void testReadCompleteExcel() throws IOException {
		
		ReadExcelFile.readExcel("datafiles/datos.xlsx", "Hoja1");
		
	}
	
	@Test(description = "Read a cell excel file")
	public void testReadCellExcel() throws IOException {
		
		String cell = ReadExcelFile.getCellValue("datafiles/datos.xlsx", "Hoja1", 1, 5);
		System.out.println("Cell value = " + cell);
		
	}

}
