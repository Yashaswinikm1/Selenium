package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Days31 
{
	public static void main(String args[])throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("ok");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ok@yahoo.com");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.cssSelector("input[id='password']"));
		element.sendKeys("ok123@");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
