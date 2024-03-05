package Boxon.Saas;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.internal.Either;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestAdditionaladdress extends BrowserTest {

		@Test(priority = 1)
			public void consingnee() throws InterruptedException {
			driver.findElement(By.id("unameTxt")).sendKeys("IBLEC1101");
			driver.findElement(By.id("passwordTxt")).sendKeys("Iblesoft@123");
			driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
			Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]")).click();
			Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"addusers\"]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"typeuserTxt\"]")).click();
	        Select Usertype = new Select(driver.findElement(By.id("typeuserTxt")));
	        Usertype.selectByValue("Consignee");
	        Thread.sleep(1000);
	        WebElement firstname=driver.findElement(By.id("fnameTxt"));
			firstname.clear();
			firstname.sendKeys("Vijay");
			WebElement lastname=driver.findElement(By.id("lnameTxt"));
			lastname.clear();
			lastname.sendKeys("Krishna");
			Thread.sleep(2000);
			WebElement address1=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[3]/div[1]/div/textarea"));
			address1.click();
			address1.sendKeys("108th NorthPole");
			WebElement address2=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[3]/div[2]/div/textarea"));
			address2.click();
			address2.sendKeys("SouthEast");
			Select country=new Select(driver.findElement(By.id("country2Txt")));
			country.selectByVisibleText("INDIA");
			Thread.sleep(1000);
			WebElement statec=driver.findElement(By.xpath("//*[@id=\"state2Txt\"]"));
			statec.click();
			Select state = new Select(driver.findElement(By.id("state2Txt")));
			state.selectByVisibleText("ANDHRA PRADESH");
			Thread.sleep(1500);
			Select city = new Select(driver.findElement(By.id("city2Txt")));
			city.selectByVisibleText("TIRUPATI");
			Thread.sleep(3000);
			WebElement zip=driver.findElement(By.xpath("//form[@name='userprofileFormThree']//div//div//div//div//input[@name='zipTxt']"));
			zip.click();
			zip.sendKeys("255856");
			Thread.sleep(1000);
			WebElement idtyp=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[6]/div[1]/div/select"));
			idtyp.click();
			Select idtype = new Select(driver.findElement(By.id("idtypeTxt")));
			idtype.selectByVisibleText("NationalId");
			Thread.sleep(1000);
			WebElement idvalue=driver.findElement(By.id("idvalueTxt"));
			idvalue.click();
			idvalue.sendKeys("9856585");
			Thread.sleep(2000);
			WebElement email=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[7]/div/div/input"));
			email.click();
			email.sendKeys("Jyotheeswar9999@gmail.com");
			Thread.sleep(3000);
			WebElement svb=driver.findElement(By.xpath("//*[@id=\"userprofileFormThree\"]/div/div[8]/div/input[1]"));
			svb.click();
		}	
			@Test(priority = 2)
			public void shipper() throws InterruptedException {
			driver.findElement(By.id("unameTxt")).sendKeys("IBLEC1101");
			driver.findElement(By.id("passwordTxt")).sendKeys("Iblesoft@123");
			driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
			Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]")).click();
			Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"addusers\"]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"typeuserTxt\"]")).click();
	        Select Usertype = new Select(driver.findElement(By.id("typeuserTxt")));
	        Usertype.selectByValue("Shipper");
	        Thread.sleep(1000);
	        WebElement firstname=driver.findElement(By.id("fnameTxt"));
			firstname.clear();
			firstname.sendKeys("Vijay");
			WebElement lastname=driver.findElement(By.id("lnameTxt"));
			lastname.clear();
			lastname.sendKeys("Krishna");
			Thread.sleep(2000);
			WebElement address1=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[3]/div[1]/div/textarea"));
			address1.click();
			address1.sendKeys("108th NorthPole");
			WebElement address2=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[3]/div[2]/div/textarea"));
			address2.click();
			address2.sendKeys("SouthEast");
			Select country=new Select(driver.findElement(By.id("country2Txt")));
			country.selectByVisibleText("INDIA");
			Thread.sleep(1000);
			WebElement statec=driver.findElement(By.xpath("//*[@id=\"state2Txt\"]"));
			statec.click();
			Select state = new Select(driver.findElement(By.id("state2Txt")));
			state.selectByVisibleText("ANDHRA PRADESH");
			Thread.sleep(1500);
			Select city = new Select(driver.findElement(By.id("city2Txt")));
			city.selectByVisibleText("TIRUPATI");
			Thread.sleep(2000);
			WebElement zip=driver.findElement(By.xpath("//form[@name='userprofileFormThree']//div//div//div//div//input[@name='zipTxt']"));
			zip.click();
			zip.sendKeys("255856");
			Thread.sleep(1000);
			WebElement idtyp=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[6]/div[1]/div/select"));
			idtyp.click();
			Select idtype = new Select(driver.findElement(By.id("idtypeTxt")));
			idtype.selectByVisibleText("NationalId");
			Thread.sleep(1000);
			WebElement idvalue=driver.findElement(By.id("idvalueTxt"));
			idvalue.click();
			idvalue.sendKeys("9856585");
			Thread.sleep(2000);
			WebElement email=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[7]/div/div/input"));
			email.click();
			email.sendKeys("Jyotheeswar9999@gmail.com");
			Thread.sleep(3000);
			WebElement svb=driver.findElement(By.xpath("//*[@id=\"userprofileFormThree\"]/div/div[8]/div/input[1]"));
			svb.click();
			}
			@Test(priority = 3)
			public void Thirdyparty() throws InterruptedException {
			driver.findElement(By.id("unameTxt")).sendKeys("IBLEC1101");
			driver.findElement(By.id("passwordTxt")).sendKeys("Iblesoft@123");
			driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
			Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]")).click();
			Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"addusers\"]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"typeuserTxt\"]")).click();
	        Select Usertype = new Select(driver.findElement(By.id("typeuserTxt")));
	        Usertype.selectByValue("Third Party");
	        Thread.sleep(1000);
	        WebElement firstname=driver.findElement(By.id("fnameTxt"));
			firstname.clear();
			firstname.sendKeys("Vijay");
			WebElement lastname=driver.findElement(By.id("lnameTxt"));
			lastname.clear();
			lastname.sendKeys("Krishna");
			Thread.sleep(2000);
			WebElement address1=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[3]/div[1]/div/textarea"));
			address1.click();
			address1.sendKeys("108th NorthPole");
			WebElement address2=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[3]/div[2]/div/textarea"));
			address2.click();
			address2.sendKeys("SouthEast");
			Select country=new Select(driver.findElement(By.id("country2Txt")));
			country.selectByVisibleText("INDIA");
			Thread.sleep(1000);
			WebElement statec=driver.findElement(By.xpath("//*[@id=\"state2Txt\"]"));
			statec.click();
			Select state = new Select(driver.findElement(By.id("state2Txt")));
			state.selectByVisibleText("ANDHRA PRADESH");
			Thread.sleep(1500);
			Select city = new Select(driver.findElement(By.id("city2Txt")));
			city.selectByVisibleText("TIRUPATI");
			Thread.sleep(2000);
			WebElement zip=driver.findElement(By.xpath("//form[@name='userprofileFormThree']//div//div//div//div//input[@name='zipTxt']"));
			zip.click();
			zip.sendKeys("255856");
			Thread.sleep(1000);
			WebElement idtyp=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[6]/div[1]/div/select"));
			idtyp.click();
			Select idtype = new Select(driver.findElement(By.id("idtypeTxt")));
			idtype.selectByVisibleText("NationalId");
			Thread.sleep(1000);
			WebElement idvalue=driver.findElement(By.id("idvalueTxt"));
			idvalue.click();
			idvalue.sendKeys("9856585");
			Thread.sleep(2000);
			WebElement email=driver.findElement(By.xpath("/html/body/div[3]/section/main/div/div[3]/div/div/form/div/div[7]/div/div/input"));
			email.click();
			email.sendKeys("Jyotheeswar9999@gmail.com");
			Thread.sleep(3000);
			WebElement svb=driver.findElement(By.xpath("//*[@id=\"userprofileFormThree\"]/div/div[8]/div/input[1]"));
			svb.click();
			Thread.sleep(1000);
	}
	}