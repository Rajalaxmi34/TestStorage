package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC01 {
	
	WebDriver driver;
	
	@BeforeClass
	public void LunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
			
		}
	
	
	@Test
	public void Testcase(){
		
		driver.findElement(By.id("qsbClick")).click();
		
		driver.findElement(By.name("qp")).sendKeys("selenium");
		
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		driver.findElement(By.id("qsbFormBtn")).click();
	
		
	}
	
	@AfterClass
	public void quit(){
		
		driver.quit();
	}
	
	

}
