package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment2 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.cssSelector("button[type='submit']"));
		ele.submit();
		Thread.sleep(6000);
	
		
	}

}
