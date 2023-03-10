package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGEx02 {
	@BeforeClass
	public void setUp(){
		System.out.println("To initialize browser and to open URL");
		System.out.println("To initialize browser and to open URL");
		System.out.println("To initialize browser and to open URL");
	}
	
	@AfterMethod
	public void refreshPg(){
		System.out.println("To refresh the page after each validation");
	}
	
	@Test (priority=1)
	public void userReg(){
		System.out.println("Validate user Registration");
	}
	@Test (priority=2)
	public void userLogin(){
		System.out.println("Login validation");
	}
	
	@BeforeMethod
	public void homePg(){
		System.out.println("To set Home page before each validation");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("to close application");
	}


}
