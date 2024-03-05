package Boxon.Saas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class dropdowntest {

	WebDriver driver;

	@Test
	public void dd() throws InterruptedException {
		
    ChromeOptions co= new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
	driver =new ChromeDriver(co);
    driver.manage().window().maximize();
    driver.get("https://iblesoft.smarteweb.com/");
    driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div[1]/ul/li[2]/a")).click();
    
//    
//    driver.findElement(By.xpath("//*[@id=\"countryTxt\"]")).click();
////
//    String option = "Highest to lowest";
//
//    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\\\"countryTxt\\\"], '" + option + "')]"));
    
    
   
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement we = driver.findElement(By.cssSelector("#countryTxt"));
	we.click();

}
	
}
	
	
	
	
	
	
	
	
	
	
