package ReadingWritingData.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	static String excelpath= "C:\\Users\\vasadash\\eclipse-workspace\\SeleniumProject\\TestData\\BookData.xlsx";

	public static void main(String[] args) throws IOException {
//		FileInputStream file= new FileInputStream("C:\\Users\\vasadash\\eclipse-workspace\\SeleniumProject\\TestData\\BookData.xlsx");
//		FileInputStream file= new FileInputStream("C:\\Users\\vasadash\\Desktop\\BookData.xlsx");
//		FileInputStream file= new FileInputStream("C:\\Users\\vasadash\\Desktop\\BookData.xlsx");
//		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\BookData.xlsx");
		
		
		FileInputStream inouteStream= new FileInputStream(excelpath);
		XSSFWorkbook workbook= new XSSFWorkbook(inouteStream);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //workbook.getsheetAt(0);
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
	
		System.out.println("number of rows: "+ totalrows);
		System.out.println("number of cells: "+ totalcells);
		
		for(int r=0;r<=totalrows;r++) {
			XSSFRow currentrow= sheet.getRow(r);
				for(int j=0;j<totalcells; j++) {
					String value= currentrow.getCell(j).toString();
					System.out.print(value+"     ");
				}
					System.out.println();
		}
		
		workbook.close();
		
		
		
	}

}
