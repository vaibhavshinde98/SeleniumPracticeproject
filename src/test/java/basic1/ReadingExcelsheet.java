package basic1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelsheet {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\vasadash\\eclipse-workspace\\SeleniumProject\\src\\test\\java\\BookData.xlsx");
//		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\BookData.xlsx");
		
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");   

	
		int totalrows= sheet.getLastRowNum();
		
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows: "+ totalrows);
		System.out.println("number of cells " + totalcells);
		
	}

}
