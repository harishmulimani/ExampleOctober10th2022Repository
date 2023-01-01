package com.sgtesting.pageobjectmodelassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
	public Users(WebDriver obrowser) {
		PageFactory.initElements(obrowser, this);

	}
	@FindBy(xpath = "//div[text()='Add User']")private WebElement adduser;
	private WebElement firstName;
	private WebElement lastName;
	private WebElement   email;
	private WebElement   userDataLightBox_usernameField;
	private WebElement   userDataLightBox_passwordField;
	private WebElement   userDataLightBox_passwordCopyField;
	@FindBy(xpath = "//span[text()='Create User']")private WebElement createuser;
	private WebElement userDataLightBox_deleteBtn;
	@FindBy(xpath = "//a[text()='Logout']")private WebElement oLogout;
	@FindBy(xpath = "//span[text()='user1, demo1']")private WebElement user1;
	public WebElement getUser1() {
		return user1;
	}

	@FindBy(xpath = "//span[text()='Save Changes']")private WebElement savechanges;
	public WebElement getSavechanges() {
		return savechanges;
	}
	public WebElement getAdduser() {
		return adduser ;
	}
	public WebElement  getFirstname() {
		return firstName;
	}
	public WebElement getLastname()  {
		return lastName ;
	}
	public WebElement getEmail()  {
		return email;
	}
	public WebElement  getUserNameField(){
		return userDataLightBox_usernameField;
	}
	public WebElement getPasswordfield()  {
		return userDataLightBox_passwordField;
	}
	public WebElement getPasswordcopyfield() {
		return userDataLightBox_passwordCopyField;
	}
	public WebElement  getCreateuser(){
		return createuser;
	}
	public WebElement getDeleteuser()  {
		return userDataLightBox_deleteBtn ;
	}
	public WebElement getLogout() {
       return oLogout;
}
}