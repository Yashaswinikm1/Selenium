package Famskit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment41 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//to search in search bar
		WebElement ele = driver.findElement(By.cssSelector("input[name='q']"));
		ele.sendKeys("clothes");
		Thread.sleep(3000);
		ele.submit();
		
		//to access the displayed product list
		List<WebElement> clothes = driver.findElements(By.xpath("//div[contains(@class,'syl9yP')]"));
		Thread.sleep(3000);
		for( int i=0;i<clothes.size();i++)
		{
			System.out.println(i+" = "+clothes.get(i).getText());
			System.out.println("===========================");
		}
		Thread.sleep(3000);
		
		
	}

}
