package com.orangehrm;

import java.io.IOException;

import org.testng.annotations.Test;

import com.helpers.Conditions;
import com.helpers.WriteExcelFile;

public class TestWriteExcel extends Conditions {

	@Test(description = "Write value on the excel file")
	public void testWriteCellExcel() throws IOException {
		
		WriteExcelFile.writeCellValue("datafiles/datos.xlsx", "Hoja2", 0, 0, "asdasd");
	
	}
}
