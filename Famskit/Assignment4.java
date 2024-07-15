package Famskit;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement iphone = driver.findElement(By.cssSelector("input[class='Pke_EE']"));
		iphone.sendKeys("iphone 13 pro");
		Thread.sleep(3000);
		iphone.submit();
		String expected = "search";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		Thread.sleep(3000);
		
		/*
		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]"));
		Thread.sleep(3000);
		for(WebElement all:items)
		{
			System.out.println(all.getText());
		}
		*/
		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]"));
		Iterator<WebElement> ref =  items.iterator();
		while(ref.hasNext())
		{
			System.out.println(ref.next().getText());
		}
		
		
	}

}
