package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class UserManagement extends SeleniumWrapper{

	public UserManagement(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By link_admin = By.xpath("//a[@id = 'menu_admin_viewAdminModule']");
	By txt_search = By.xpath("//input[@id='searchSystemUser_userName']");
	By btn_search = By.xpath("//input[@id = 'searchBtn']");
	By tbl_firstRowSearch = By.xpath("//tbody/tr[1]/td[2]");
	By btn_Add = By.xpath("//input[@id = 'btnAdd']");
	By txt_empName = By.xpath("//input[@id='systemUser_employeeName_empName']");
	By txt_userName = By.xpath("//input[@id='systemUser_userName']");
	By txt_password = By.xpath("//input[@id='systemUser_password']");
	By txt_confirmPassword = By.xpath("//input[@id='systemUser_confirmPassword']");
	By btn_Save = By.xpath("//input[@id = 'btnSave']");

	/*
	 * Validate logged successfully
	 */
	
	public void validateLogged() {
		reporterLog("Validate that you have logged in successfully");
		takeScreenshot("ValidatePage");
		waitForElementPresent(link_admin, 10);
	}
	
	/*
	 * Click Admin
	 */
	public void clickAdmin() {
		reporterLog("Click Admin - Go to the admin page");
		click(link_admin, "Admin");
		implicitlyWait(5);
		takeScreenshot("AfterClickAdmin");
	}
	
	/*
	 * Search User
	 */
	public void searchUser(String user, boolean clickSearch) {
		reporterLog("Search username in field");
		type(txt_search, user, "Search field");
		takeScreenshot("Aftertype"+user);
		if(clickSearch) {
			click(btn_search, "Button Search");
		}
		implicitlyWait(5);
		takeScreenshot("SearchUser"+user);
	}
	
	/*
	 * Validate value from search table
	 */
	
	public void validateFromSearchTable(String expectedValue) {
		reporterLog("Verify value in search table");
		String actualValue = getText(tbl_firstRowSearch);
		assertEquals(actualValue, expectedValue);
	}
	
	/*
	 * Validate value from search table
	 */
	
	public void validateFromSearchTable(String row, String column, String expectedValue) {
		reporterLog("Verify value in search table");
		String actualValue = getValueFromTable(row, column);
		assertEquals(actualValue, expectedValue);
	}
	
	/*
	 * Click Add
	 */
	public void clickAdd(boolean AddNewUser, String empName, String userNameNew, String passwordNew, String confirmPasswordNew, boolean clicksave) {
		reporterLog("Click Add");
		click(btn_Add, "Add");
		implicitlyWait(5);
		
		if(AddNewUser) {
			
			reporterLog("Enter valid Employee Name");
			type(txt_empName, empName, "Employee Name");
			implicitlyWait(5);
			
			reporterLog("Enter valid username");
			type(txt_userName, userNameNew, "New User Name");
			implicitlyWait(5);
			
			reporterLog("Enter new password and confirm");
			type(txt_password, passwordNew, "New Password");
			type(txt_confirmPassword, confirmPasswordNew, "Confirm Password");
			implicitlyWait(10);
			
			if (clicksave) {
				reporterLog("Click Save");
				click(btn_Save, "Save");
				implicitlyWait(5);
			}
		}
	}
		
	
}
