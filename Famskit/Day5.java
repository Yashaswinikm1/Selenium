package Famskit;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//to mximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//to search the product
		WebElement search = driver.findElement(By.cssSelector("input[name='q']"));
		search.sendKeys("iphone 13");
		Thread.sleep(3000);
		
		search.submit();
		
		/*
		//To acess the product
		WebElement product = driver.findElement(By.xpath("//div[.='Apple iPhone 13 (Pink, 128 GB)']"));
		Thread.sleep(3000);
		
		
		//To access the price 
		WebElement price = driver.findElement(By.xpath("//div[.='Apple iPhone 13 (Pink, 128 GB)']/../following-sibling::div/div[contains(@class,'c')]/div/div[contains(@class,'N')]"));
		Thread.sleep(3000);
		//to print
		 * System.out.println(product.getText()+"---->"+price.getText());
		Thread.sleep(3000);
		
		*/
		List<WebElement> item = driver.findElements(By.xpath("//div[contains(@class,'Kz')]"));
		Thread.sleep(3000);
		
		List<WebElement> itemPrice = driver.findElements(By.xpath("//div[contains(@class,'Kz')]/../following-sibling::div/div[contains(@class,'c')]/div/div[contains(@class,'N')]"));
		Thread.sleep(3000);
		
		/*for(int i = 0,j=0;i<item.size();i++,j++)
		{
			System.out.println(item.get(i).getText()+"---->"+itemPrice.get(j).getText());
			System.out.println("==================");
		}*/
		Iterator<WebElement> itr = item.iterator();
		Iterator <WebElement> itr1 = itemPrice.iterator();
		while(itr.hasNext() && itr1.hasNext())
		{
			System.out.println(itr.next().getText()+"---------->"+itr1.next().getText());
			System.out.println("===========================");
		}
		
	}

}
