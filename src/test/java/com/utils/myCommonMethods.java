package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class myCommonMethods {

	public static void readFromExcel(String filename, String sheetname) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		int sheetNumbers = workbook.getNumberOfSheets();

		for (int i = 0; i < sheetNumbers; i++) {
			//System.out.printf("Current Sheet : [%s]%n", workbook.getSheetName(i));
			XSSFSheet sheet = workbook.getSheetAt(i);

			if (workbook.getSheetName(i).contentEquals(sheetname)) {

				Iterator<Row> rows = sheet.iterator();
				while (rows.hasNext()) {

					Row currentRow = rows.next();
					Iterator<Cell> cells = currentRow.cellIterator();
					while (cells.hasNext()) {

						Cell value = cells.next();
						System.out.printf("[%-20s]  ", value);
					}
					System.out.println();
					
				}

				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	
	@Test
	public void test() {
		
		
		String fileName=System.getProperty("user.dir")+"/Properties/testExcelDontDelete.xlsx";
		String mySheet="Users";
		
		readFromExcel(fileName,mySheet);
		
		//NumberToTextConverter
		
	}
	
}
