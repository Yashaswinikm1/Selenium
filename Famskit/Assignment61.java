package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment61 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='radio' and @id='attended']"));
		
		Thread.sleep(3000);
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		Thread.sleep(3000);
		System.out.println(ele.getSize());
		System.out.println(ele.getLocation());
		Thread.sleep(3000);
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getTagName());
		
	}

}
