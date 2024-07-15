package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("ok");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Ok123@gmail.com");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("password"));
		Thread.sleep(3000);
		element.sendKeys("Ok@123");
		Thread.sleep(3000);
		
		element.submit();
		Thread.sleep(3000);
		driver.close();

	}

}
