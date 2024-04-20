package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./src/test/resources/TestData55.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("sheet1");
	
	 // setting into single cell
	 sh.createRow(5).createCell(0).setCellValue("test");
	 FileOutputStream fos= new FileOutputStream("./src/test/resources/TestData55.xlsx");
	 wb.write(fos);
	 
	 wb.close();
	 
	
	
}
}
