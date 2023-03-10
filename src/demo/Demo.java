package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority = 0)
	public void userLogin()
	{
		System.out.println("validate the login functionality");
		
	}
	@Test(priority = 1)
	public void userReg()
	{
		System.out.println("validate the Reg functionality");
		
	}
}
