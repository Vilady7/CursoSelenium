package com.opensource.admin.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class TC003_Admin_AddNewUser {

  @BeforeTest
  public void beforeTest() {
	  //DATOS
	  
  }

  public void TC003_Admin_AddNewUser_TC() throws InterruptedException {
	  
//	  DATA GENERACION
	  int random = (int)(Math.random()*1000);
	  String userName = "FionaUsuario"+random;
	  
	  
	  // STEP 1
	  Reporter.log("Open Browser \"OrangeHRM\" web page");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	  // STEP 2
	  Reporter.log("Enter Username and Password");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  // STEP 3
	  Reporter.log("Validate that you have logged in successfully");
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id = 'menu_admin_viewAdminModule']")));

	  // STEP 4
	  Reporter.log("Click Admin - Go to the admin page");
	  driver.findElement(By.xpath("//a[@id = 'menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	  // STEP 5
	  Reporter.log("Click Add");
	  driver.findElement(By.xpath("//input[@id = 'btnAdd']")).click();
	  
	  // STEP 6
	  Reporter.log("Enter valid Employee Name");
	  driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Fiona Grace");;
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	  

	  // STEP 7
	  Reporter.log("Enter valid username");
	  driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys(userName);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	  
	  // STEP 8
	  Reporter.log("Enter new password and confirm");
	  driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Fiona*Grace12345");
	  driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Fiona*Grace12345");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	  
	  // STEP 9
	  Reporter.log("Click Save");
	  driver.findElement(By.xpath("//input[@id = 'btnSave']")).click();
	  
	  // STEP 10
	  Reporter.log("Search username in field \"Username\"");
	  driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(userName);
	  
	  // STEP 11
	  Reporter.log("Click Search");
	  driver.findElement(By.xpath("//input[@id = 'searchBtn']")).click();
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody")));
	  
	  // STEP 12
	  Reporter.log("Verify username exist in table");
	  String actualUsername = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();

	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(actualUsername, userName);
	  
	  // STEP 13
	  Reporter.log("Log out");
	  driver.findElement(By.xpath("//a[@id='welcome']")).click();
	  driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  
	  // STEP 14
	  Reporter.log("Close Browser");
	  driver.close();
	  
	  soft.assertAll();
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
