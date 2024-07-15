package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		Thread.sleep(3000);
		//div[contains(@class,'DayPicker-Body')]/div[*]/div[@aria-selected='true']
		
		
		
	}

}
