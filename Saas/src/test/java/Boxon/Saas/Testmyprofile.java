package Boxon.Saas;


import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Testmyprofile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://iblesoft.boxonlogistics.com/");
		
		driver.findElement(By.id("unameTxt")).sendKeys("IBLEC1101");
		driver.findElement(By.id("passwordTxt")).sendKeys("Iblesoft@123");
		driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[4]/ul/li[1]/a")).click();
        
        WebElement firstname=driver.findElement(By.id("fnameTxt"));
		firstname.clear();
		firstname.sendKeys("Vijay");
		WebElement lastname=driver.findElement(By.id("lnameTxt"));
		lastname.clear();
		lastname.sendKeys("Krishna");
		Select dialcode=new Select(driver.findElement(By.id("dialcodeTxt")));
		dialcode.selectByVisibleText("Finland (+358)");
		WebElement email=driver.findElement(By.id("emailTxt"));
		email.clear();
		email.sendKeys("akwallet27@mailinator.com");
		Select dailcode = new Select(driver.findElement(By.id("dialcodealtTxt")));
		dailcode.selectByVisibleText("Sweden (+46)");
		driver.findElement(By.id("anumberTxt")).sendKeys("91822558253");
		
		
		

	}

}
