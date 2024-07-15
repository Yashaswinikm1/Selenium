package Famskit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		//To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//To fetch the table
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(3000);
		
		//To fetch the first row info
		
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='w-full text-sm text-left text-gray-500 ']/tbody/tr[1]"));
		Thread.sleep(3000);
		for(int i=0;i<ele.size();i++)
		{
			System.out.println(ele.get(i).getText());
			System.out.println("===========================");
		}
		Thread.sleep(3000);
		
		//to fetch the First row
		String ele1 = driver.findElement(By.xpath("//table[@class='w-full text-sm text-left text-gray-500 ']/tbody/tr[1]/th")).getText();
		System.out.println(ele1);
		Thread.sleep(3000);
		
		//to fetch the last column
		String ele2 = driver.findElement(By.xpath("//table[@class='w-full text-sm text-left text-gray-500 ']/tbody/tr/td[4]")).getText();
		System.out.println(ele2);
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
