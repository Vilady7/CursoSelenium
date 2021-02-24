package com.opensource.admin.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

public class TC003_Admin_AddNewUser_POM {
	
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, password, empName, userNameNew, passwordNew, confirmPasswordNew;

	int random;

  @BeforeTest
  public void beforeTest() {
	  
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new Login(driver);
	  userManagement = new UserManagement(driver);
	  
	  username = "Admin";
	  password = "admin123";
	  empName = "Fiona Grace";
	  random = (int)(Math.random()*1000);
	  userNameNew = "FionaUsuario"+random;
	  passwordNew = "Fiona*Grace"+random;
	  confirmPasswordNew = "Fiona*Grace"+random;
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
	  
	  // Step 5,6,7,8,9
	  userManagement.clickAdd(true, empName, userNameNew, passwordNew, confirmPasswordNew, true);
	  
	  // Step 10,11
	  userManagement.searchUser(userNameNew, true);
	  
	  //Step 12
	  userManagement.validateFromSearchTable("1","2",userNameNew);
	  
	  // Step 8
	  login.logoutOrange();

  }
  
  @AfterTest
  public void afterTest() {
	  
	  // Step 9
	  seleniumWrapper.closeBrowser();
  }

}

