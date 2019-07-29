package com.testng.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader extends TestBase
{

	public FileInputStream fs;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row; 
	public ExcelDataReader() throws IOException
	{
		String path= prop.getProperty("path");
		fs = new FileInputStream(path);
		workbook = new XSSFWorkbook(fs);
		
	}
	
	public String getCellwiseData(int sheetIndex,int row, int col)
	{
		
		sheet=workbook.getSheetAt(sheetIndex);
		
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	
}
