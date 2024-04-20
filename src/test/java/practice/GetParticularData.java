package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetParticularData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./src/test/resources/TestData55.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("sheet1");
	String expValue = "spiders";
	int rowCount = sh.getLastRowNum();
	int cellCount = sh.getRow(0).getLastCellNum();
	for (int i=0; i<=rowCount; i++) 
	{
		String actValue = sh.getRow(i).getCell(0).getStringCellValue();
		if(actValue.equalsIgnoreCase(expValue))
		{
			for(int j=0; j<cellCount; j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"     ");
			}
			break;
		}
	}
	wb.close();
}
}
