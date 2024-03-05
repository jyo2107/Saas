package Boxon.Saas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserTest {
	
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
	    ChromeOptions co= new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     driver =new ChromeDriver(co);
	     driver.manage().window().maximize();
	     driver.get("https://iblesoft.smarteweb.com/");
	}

@AfterMethod
public void Teardown() {
	driver.close();
}
}