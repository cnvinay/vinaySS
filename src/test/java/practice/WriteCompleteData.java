package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteCompleteData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=  new ChromeDriver();
	driver.get("");
	
	
	/*
	FileInputStream fis= new FileInputStream("./src/test/resources/newData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	
	//Sheet sh = wb.createSheet("friends");
	Sheet sh = wb.getSheet("sheet1");
	
	for(int i=0; i<=3; i++)
	{ 	
		//sh.createRow(i).createCell(0).setCellValue("boys");
		for(int j = 0 ; j<=2;  j++)
		{
			//sh.getRow(i).getCell(j).setCellValue("");
			sh.createRow(j).createCell(i).setCellValue("boys");
		}
//		System.out.println();
	}
	FileOutputStream fos = new FileOutputStream("./src/test/resources/newData.xlsx");
	wb.write(fos);
	
	wb.close();
	*/

}
}
