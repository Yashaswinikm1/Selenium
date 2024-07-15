package Famskit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		//to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//To get url
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//to minimize
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To shift to other window
		Navigation nav = driver.navigate();
		
		nav.to("https://www.myntra.com/");
		Thread.sleep(2000);
		
		//to refresh the window
		nav.refresh();
		Thread.sleep(2000);
		
		//to move forward
		nav.forward();
		Thread.sleep(2000);
		
		//to move backward
		nav.back();
		Thread.sleep(2000);
		
		driver.close();
	}

}
