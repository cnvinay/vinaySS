package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "organization")// method name in string
	public void getData(String org, String loc)
	{
		System.out.println("Organization--------> "+org+" is located in "+loc);
	}
	
	@Test(dataProvider = "data2")
	public void  readData(String state, String dist)
	{
		System.out.println("State------> "+state+" district -----> "+dist);
	}
	
	

	@DataProvider(name="organization")
	public Object[][] data1()
	{
		Object[][] obj = new  Object[3][2];

		obj[0][0] = "Qspiders";
		obj[0][1] = "Bangalore";

		obj[1][0] = "Jspiders";
		obj[1][1] = "Mysore";

		obj[2][0] = "py";
		obj[2][1] = "uk";

		return obj; 
	}

	@DataProvider
	public Object[][] data2 ()
	{
		Object[][] obj = new  Object[3][2];

		obj[0][0] = "karnataka";
		obj[0][1] = "Bangalore";

		obj[1][0] = "andhrapradesh";
		obj[1][1] = "ctr";

		obj[2][0] = "telangana";
		obj[2][1] = "hyb";

		return obj; 


	}

}
