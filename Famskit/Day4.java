package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.cssSelector("input[name='q']"));
		Thread.sleep(3000);
		ele.sendKeys("iphone 13");
		Thread.sleep(3000);
		ele.submit();
		Thread.sleep(3000);
		
		WebElement product = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']"));
		Thread.sleep(3000);
		System.out.println(product.getText());
		Thread.sleep(3000);
		product.click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
