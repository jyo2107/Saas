package Boxon.Saas;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends BrowserTest {

	// WebDriver driver;

	@Test
	public void Login1() throws InterruptedException {

		driver.findElement(By.id("unameTxt")).sendKeys("IBLEC1080");

		driver.findElement(By.id("passwordTxt")).sendKeys("Boxon@123");

		driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();

		String actualMsg = driver.findElement(By.className("alert-message")).getText();
		String expMsg = "You have successfully logged in";
		if (actualMsg.equals(expMsg)) {
			System.out.println("Test Case1 Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}
	
	  @Test public void Login2() throws InterruptedException {
	  
	  
	  driver.findElement(By.id("unameTxt")).sendKeys("IBLEC1080");
	 
	 driver.findElement(By.id("passwordTxt")).sendKeys("Boxon@128");
	  
	  driver.findElement(By.xpath(
	  "//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).
	  click();
	  
	  
	  try { assertEquals(driver.findElement(By.
	  className("alert alert-danger alert-dismissible")).getText(),
	  "Your username OR password is incorrect or inactive");
	  
	  System.out.println("FAIL");
	  driver.findElement(By.className("alert-message")).getText();
	  
	  } catch (Exception e) {
	  
	  assertEquals(driver.findElement(By.
	  className("alert alert-danger alert-dismissible")).getText(),
	  "Your username OR password is incorrect or inactive");
	  System.out.println("FAIL");
	  
	  } }
	  
	  
	  @Test public void Login3() throws InterruptedException {
	  
	  
	  driver.findElement(By.id("unameTxt")).sendKeys("IBLEC10856");
	  
	  driver.findElement(By.id("passwordTxt")).sendKeys("Boxon@123");
	  
	  driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
	  
	  try {
	  assertEquals(driver.findElement(By.className("alert-message")).getText(),
	  "You have successfully logged in");
	  
	  System.out.println("PASS");
	  driver.findElement(By.className("alert-message")).getText();
	  
	  } catch (Exception e) {
	  
	  assertEquals(driver.findElement(By.
	  className("alert alert-danger alert-dismissible")).getText(),
	  "Your username OR password is incorrect or inactive");
	  System.out.println("FAIL");
	  
	  }
	  }
	 

	@Test
	public void Login4() throws InterruptedException {

		driver.findElement(By.id("unameTxt")).sendKeys("IBLEC10866");

		driver.findElement(By.id("passwordTxt")).sendKeys("Boxon@9856");

		driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();

		String actualMsg = driver.findElement(By.className("alert-message")).getText();
		String expMsg = "Your username OR password is incorrect or inactive";
		if (actualMsg.equals(expMsg)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}
}
