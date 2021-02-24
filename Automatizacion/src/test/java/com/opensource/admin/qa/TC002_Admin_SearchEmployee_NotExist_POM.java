package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class TC002_Admin_SearchEmployee_NotExist_POM {
	
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, password, usernamenoexist, notfoundMessage;

  @BeforeTest
  public void beforeTest() {
	  
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new Login(driver);
	  userManagement = new UserManagement(driver);
	  
	  username = "Admin";
	  password = "admin123";
	  usernamenoexist = "XYZ";
	  notfoundMessage = "No Records Found";
	  
  }

  @Test
  public void TC002_Admin_SearchEmployee_NotExist_POM_TestScript() {
	  
	  // Step 1
	  seleniumWrapper.launchBrowser(GlobalVariables.QA_URL);
	  
	  // Step 2
	  login.loginOrange(username, password);
	  
	  // Step 3
	  userManagement.validateLogged();
	  
	  // Step 4
	  userManagement.clickAdmin();
	  
	  // Step 5
	  // Step 6
	  userManagement.searchUser(usernamenoexist, true);
	  
	  //Step 7
	  userManagement.validateFromSearchTable("1","1",notfoundMessage);
	  
	  // Step 8
	  login.logoutOrange();

  }
  
  @AfterTest
  public void afterTest() {
	  
	  // Step 9
	  seleniumWrapper.closeBrowser();
  }

}
