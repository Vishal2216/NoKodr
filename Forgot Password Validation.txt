package Nokodr;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NokodrForgetPassward
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
		 driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("vp7721948543@gmail.com");
		 driver.findElement(By.xpath("(//div[@id='staticElement'])[7]")).click();
		 
		 
		 //Verify forget passward verification code
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Verification Code For Forgate Passward");
			Thread.sleep(2000);
			String verificationCode = sc.next();
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(verificationCode);
				driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[2]")).click();
			    Thread.sleep(2000);
			
			    //Enter New Passward
			    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Patil@123");
			    driver.findElement(By.xpath("//input[@name='password-confirmpassword']")).sendKeys("Patil@123");
			    driver.findElement(By.xpath("  (//button[@class='slds-button slds-button_brand'])[2]")).click();
			     
}
}