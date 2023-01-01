package com.sgtesting.pocAssignments;




import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	
	@Parameters(value="username")
	@Test
	public void createUser(String username)
	{
		System.out.println("The User "+username+" has created Successfully!!");
	}
	
	@Test
	public void modifyUser()
	{
		System.out.println("The User demoUser1 has modified Successfully!!");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("The User demoUser1 has deleted Successfully!!");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser, Navigate the URL and Login into the Application");
	}

	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and Close Aplication");
		System.out.println("++++++++++++++++++++++");
	}


}
