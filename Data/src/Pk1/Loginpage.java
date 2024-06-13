package Pk1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginpage {

	
	public static void main (String[] args)
	{
		System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); //Creating an object of FirefoxDriver
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");	
		
		
		driver.findElement(By.xpath("//a[@id='u_0_0_Fr']")).click();
		
	}
}
