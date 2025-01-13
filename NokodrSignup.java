package Nokodr;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

class NokodrSignup
{
	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demoworkshop
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		
		 
		 try 
	        {
	          
		driver.findElement(By.xpath("//div[@class='slds-float_right'] [1]/a")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/abx-sign-up/div/div/div[2]/span/abx-tabs/div/div/abx-tab[1]/div/div/abx-form/div/div/abx-container/div/div/div/span[1]/abx-layout-item/div/abx-field/div/div/div/div[1]/abx-email/input")).sendKeys("vp7721948543@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[2]")).click();
		
		
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Verification Code Send On Gmail ");
			Thread.sleep(2000);
			String verificationCode = sc.next();
			
			driver.findElement(By.xpath("//input[@name='code']")).sendKeys(verificationCode);
		}
			driver.findElement(By.xpath("//div[text()='Verify Code']")).click();
		    Thread.sleep(2000);
		
		    
		    
		    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Vishal");
		    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Patil");
		    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Vishal@123");
		    driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("Vishal@123");
		    driver.findElement(By.xpath("//div[@title='Register']")).click();
		  
		    
		    
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Error Occured"+e.getMessage());
	        } 
	        finally 
	        {
	            
	          Thread.sleep(2000);
	          
	        }
	    }
	}