package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideDemo {
	@Test(dataProvider = "getdata")
	public void Stringcancat(String a, String b)
	{
		String str=a.concat(b);
		System.out.println(str);
	}

	@DataProvider
	public Object[][] getdata()
	{
	 Object[][] data=new Object[3][2];
	
	data[0][0]="Madhukar";
	data[0][1]="test";
	
	data[1][0]="Sridhar";
	data[1][1]="R";
	
	data[2][0]="testing";
	data[2][1]="tools";
	return data;
	

}
}
