package Nokodr;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript 
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
		
}
}