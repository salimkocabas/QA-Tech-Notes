package _705_Working_with_XL_Sheets;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	public static void main(String[] args) throws IOException {


		// fileInputStream argument
		FileInputStream fis = new FileInputStream("D:\\my.Codes\\my.World\\My.Codes\\_705_Working_with_XL_Sheets\\myExcel.xlsx");

		// Open file as an Excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get sheets
		int sheetNumbers = workbook.getNumberOfSheets();
		// System.out.println(sheetNumbers);

		// get first sheet only
//		System.out.printf("Current Sheet : [%s]%n",workbook.getSheetName(0));
//		XSSFSheet sheet = workbook.getSheetAt(0);

		// get all sheets
		for (int i = 0; i < sheetNumbers; i++) {
			System.out.printf("Current Sheet : [%s]%n", workbook.getSheetName(i));
			XSSFSheet sheet = workbook.getSheetAt(i);

			// go inside to sheet, get rows
			Iterator<Row> rows = sheet.iterator();

			while (rows.hasNext()) {

				Row currentRow = rows.next(); // read first rows

				// go inside to raw,get cells
				Iterator<Cell> cells = currentRow.cellIterator();
				while (cells.hasNext()) {

					Cell value = cells.next();
					System.out.printf("[%-20s]  ", value);
				}
				System.out.println();
			}

			System.out.println("-----------------------------");
		}
	
		workbook.close();
		fis.close();
	}

}
