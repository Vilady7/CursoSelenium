package com.opensource.admin.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

public class TC001_Admin_SearchEmployee_POM {
	
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, password;

  @BeforeTest
  public void beforeTest() {
	  
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new Login(driver);
	  userManagement = new UserManagement(driver);
	  
	  username = "Admin";
	  password = "admin123";
	  
  }

  @Test
  public void TC001_Admin_SearchEmployee_POM_TestScript() {
	  
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
	  userManagement.searchUser(username, true);
	  
	  //Step 7
	  userManagement.validateFromSearchTable(username);
	  
	  // Step 8
	  login.logoutOrange();
  }
  
  @AfterTest
  public void afterTest() {
	  
	  // Step 9
	  seleniumWrapper.closeBrowser();
  }

}