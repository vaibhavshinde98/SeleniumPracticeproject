package basic1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException  {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\BookData1s.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		sheet.createRow(0).createCell(1).setCellValue("welcome");
		sheet.createRow(0).createCell(2).setCellValue("12345");
		sheet.createRow(0).createCell(3).setCellValue("xyz");
		
		sheet.createRow(1).createCell(1).setCellValue("abc");
		sheet.createRow(1).createCell(2).setCellValue("909");
		sheet.createRow(1).createCell(3).setCellValue("testing");
		
		workbook.write(file);
		workbook.close();
		System.out.println("writing is done");


	}

}
