package Famskit;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Final_code 
{
	public static void main(String args[]) throws Exception
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@value='lohi']")).click();
		
		Boolean flag = true;
		List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		List<Double> prices = new ArrayList<>();

	        
	        for (WebElement element : priceElements) 
	        {
	            String priceText = element.getText().substring(1);  
	            prices.add(Double.parseDouble(priceText));
	        }

	        for (int i = 0; i < prices.size(); i++)
	        {
	        	double v1 = prices.get(i);
	        	double v2 = prices.get(i+1);
	        	
	        	if(v1>v2)
	        	{
	        		flag = true;
	        	}
	        	else
	        	{
	        		flag = false;
	        		break;
	        	}
	                
		    }
	        if(flag == true)
	        {
	        	System.out.println("Products are not sorted");
	        }
	        else
	        	System.out.println("Products are sorted");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Yashuuu");
	        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("OkOK");
	        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("We");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//input[@id='continue']")).click();
	        Thread.sleep(3000);
	        List<WebElement> priceInCart = driver.findElements(By.xpath("//div[@data-test='inventory-item-price']"));
			
			List<Double> pricesInCart = new ArrayList<>();

		        double count = 0;
		        for (WebElement ele : priceInCart) 
		        {
		            String priceText = ele.getText().substring(1);  
		            double k = Double.parseDouble(priceText);
		            pricesInCart.add(k);
		            count += k;
		        }
		        
		        List<Double> finalSum = new ArrayList<>();
		        
		       /* WebElement tax = driver.findElement(By.xpath("//div[@class=\"summary_tax_label\"]"));
		        String priceText1 = tax.getText().substring(1);  
	            double val1 = Double.parseDouble(priceText1);
	            finalSum.add(val1);
	            
	            System.out.print(finalSum);
		        double count = 0;
		        for(Double all:pricesInCart)
				{
					count += all;
				}
		       double val = finalSum.get(0);
		       double totSum = count+val;
	        
		      WebElement total = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		      String priceText2 = total.getText().substring(1);  
	          finalSum.add(Double.parseDouble(priceText2));
	            double last = finalSum.get(1);
	            if(totSum == last)
	            {
	            	System.out.print("Validated");
	            }
	            else
	            	System.out.print("Not Validated");
		        driver.findElement(By.xpath("//button[text()='Finish']")).click();
		        Thread.sleep(3000);
		        */
		        WebElement tax1 = driver.findElement(By.xpath("//div[@class=\"summary_tax_label\"]"));
		        WebElement total1 = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		        
		        
		        String taxText = tax1.getText().replaceAll("[^0-9.]", "");
		        String totalText = total1.getText().replaceAll("[^0-9.]", "");

		        Thread.sleep(3000);
		        double tax = Double.parseDouble(taxText);
		        double total = Double.parseDouble(totalText);
		        
		        

		        // Calculate the expected total price (item total + tax)
		        double expectedTotal = count + tax;
		        if(expectedTotal == total)
	            {
	            	System.out.print("Validated");
	            }
	            else
	            	System.out.print("Not Validated");
		        driver.findElement(By.xpath("//button[text()='Finish']")).click(); 
	            
	        TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(".\\ScreenShots"+"okok.png");
			Files.copy(src, dest);
			
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[text()='Back Home']")).click();
			driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
			
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
}
