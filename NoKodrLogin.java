package Nokodr;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoKodrLogin
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
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vp7721948543@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vishal@123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Log In']")).click();
}
}