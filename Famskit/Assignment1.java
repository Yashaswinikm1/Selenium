package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String args[])throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.cssSelector("input[class='Pke_EE']"));
		ele.sendKeys("iphone 13 pro");
		ele.submit();
		Thread.sleep(3000);
		/*
		 * 
//		WebElement elem2=driver.findElement(By.cssSelector("div[class='tUxRFH']"));
//		System.out.println(elem2.isDisplayed());
		WebElement ele2 = driver.findElement(By.className("WOvzF4"));
		Thread.sleep(3000);
		
		
		
		Thread.sleep(3000);
		
		*/
		String expected = "ele";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		
	}

}
