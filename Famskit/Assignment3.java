package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		WebElement index = driver.findElement(By.cssSelector("button[type='submit']"));
		index.click();
		
		String expected = "index";
		String current = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		if(current.contains(expected))
			System.out.println("True");
		else
			System.out.println("False");
		Thread.sleep(3000);
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		Thread.sleep(3000);
		admin.click();
		Thread.sleep(3000);
		String currentAdmin = "orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String expectedAdmin = driver.getCurrentUrl();
		if(expectedAdmin.contains(currentAdmin))
			System.out.println("Admin loggedIn");
		else
			System.out.println("Admin LoogedOut");
		
		driver.findElement(By.xpath("//img[contains(@alt,'profile picture')]")).click();
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.xpath("//a[text()='Logout']"));
		Thread.sleep(3000);
		log.click();
		
		String expectedLog = "index.php/auth/login";
		Thread.sleep(3000);
		String currentLog = driver.getCurrentUrl();
		
		Thread.sleep(3000);
		
		if(expectedLog.contains(currentLog))
			System.out.println("Logged out SucessFully");
		else
			System.out.println("Invalid");
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}

}
