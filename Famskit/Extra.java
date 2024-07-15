package Famskit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extra 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Logging in to the Orange Page
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
		//clicking on the performance
		driver.findElement(By.xpath("//span[text()='Performance']")).click();
		Thread.sleep(3000);
		
		
		//verifying wether performance page is displayed or not
		String current = "/performance/searchEvaluatePerformanceReview";
		Thread.sleep(3000);
		String expected = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		if(current.contains(expected))
			System.out.println("Valid perfoamce page");
		else
			System.out.println("Invalid performance page");
		Thread.sleep(3000);
		
		//To click on configure
		driver.findElement(By.xpath("//span[contains(text(),'Configure ')]")).click();
		Thread.sleep(3000);
		
		//to click on tracker
		driver.findElement(By.xpath("//a[contains(text(),'Trackers')]")).click();
		Thread.sleep(3000);
		
		//to click on add
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(3000);
		
		//to navigate backwards
		driver.navigate().back();
		Thread.sleep(3000);
		
		//to click on empolyee tracker
		WebElement tracker = driver.findElement(By.xpath("//a[contains(text(),'Employee Trackers')]"));
		Thread.sleep(3000);		
		tracker.click();
		
		//to verify the url
		String expectedTracker = "/performance/viewEmployeePerformanceTrackerList";
		String actualTracker = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		if(expectedTracker.contains(actualTracker))
			System.out.println("Valid");
		else
			System.out.println("It's invalid");
		Thread.sleep(3000);
		
		
		//to click on search button
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' View ']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Add Log ']")).click();
		Thread.sleep(3000);
		
		WebElement logInfo = driver.findElement(By.cssSelector("input[placeholder='Type here']"));
		Thread.sleep(3000);
		logInfo.sendKeys("OK");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Positive ']")).click();
		Thread.sleep(3000);
		
		WebElement commentInfo = driver.findElement(By.cssSelector("textarea[placeholder='Type here']"));
		commentInfo.sendKeys("OKOK");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(3000);
		
		//to acess the dots to delete
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-three-dots-vertical'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='Delete']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		Thread.sleep(3000);
		
		String loggedOut = "opensource-demo.orangehrmlive.com/web";
		String expectedLogout = driver.getCurrentUrl();
		
		if(expectedLogout.contains(loggedOut))
			System.out.println("Logged out sucessfully");
		else
			System.out.println("Invalid");
		driver.close();
	}

}
