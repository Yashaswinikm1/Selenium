package Famskit;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 
{
	public static void main(String args[]) throws Exception
	{
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		//to maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//to access the flipcart
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//To minimize the window
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//to access the title
		System.out.println(driver.getTitle());
		
		//to access the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to set the dimensions
		driver.manage().window().setSize(new Dimension(500,500));
		
		
		//to set the position
		driver.manage().window().setPosition(new Point(500,500));
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
