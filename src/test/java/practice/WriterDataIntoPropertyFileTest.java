package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriterDataIntoPropertyFileTest {

	public static void main(String[] args) throws IOException   {
		FileInputStream fis= new FileInputStream("./src/test/resources/CommonData.Properties");
		Properties p= new Properties();
		
		p.setProperty("browser", "chrome");
		p.setProperty("url", "http://rmgtestingserver/domain/Hospital_Management_System/");
		p.setProperty("user1", "admin");
		p.setProperty("adminusername", "admin");
		p.setProperty("adminpassword", "Test@12345");
		
		FileOutputStream fos= new FileOutputStream("./src/test/resources/CommonData.Properties");
		p.store(fos, "admin data");

	}

}
