package com.sgtesting.pageobjectmodelassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	  
	
    public LoginPage ( WebDriver obrowser) {
    	PageFactory.initElements(obrowser,this);
    }
    
      private WebElement  username;
      private WebElement  pwd;
      @FindBy(xpath = "//div[text()='Login ']")private WebElement ologin;
	

public WebElement getUsername() {
	return username;
}
	

public WebElement getPassword() {
	return pwd;
	
}
public WebElement getlogin() {
 return ologin;
	
}
}