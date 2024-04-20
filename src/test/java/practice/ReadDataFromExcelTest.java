package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis= new FileInputStream("./src/test/resources/TestData55.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("sheet1");
	
		int rowCount= sh.getLastRowNum();
		int cellCount = sh.getRow(0).getLastCellNum();
		
		for(int i=0; i<=rowCount; i++) // row 0 based index
		{
			for(int j=0; j<cellCount; j++)// cell 0+1 index
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"   ");
			}
			System.out.println(" ");
		}
		
		wb.close();
		/* multiple rows  single column
		 int rowCount = sh.getLastRowNum();
		for (int i = 0; i <=rowCount; i++) {
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}*/
		
		/* single row multiple columns  
		 int cellCount = sh.getRow(0).getLastCellNum();
		for (int i = 0; i <=cellCount; i++) {
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}*/
		
		
		/* single cell
		 String value = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);*/
		
		
	}
}
