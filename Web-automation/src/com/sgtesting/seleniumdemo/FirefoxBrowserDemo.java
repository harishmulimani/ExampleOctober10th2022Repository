package com.sgtesting.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver obrowser=null;
	public static void main(String args[]) {
		launchbrowserAndNavigate();
		}
	
	private static  void launchbrowserAndNavigate() {	
		
	
	try {
		
		obrowser=new FirefoxDriver();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	private static void navigateBrowser(){
		try{
			obrowser.get("http://localhost/login.do");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
			
		}
	
private static void CloseBrowser() {
	try {
		obrowser.close();
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
	


}
