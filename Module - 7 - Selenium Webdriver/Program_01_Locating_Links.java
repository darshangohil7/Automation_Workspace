package Tops_Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Locating_Links 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Darshan Z Index\\\\Tops\\\\Chrome Driver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://testautomationcentral.com/demo/links.html");
		driver.findElement(By.id("details-button")).click();
		
		//driver.findElement(By.linktext("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.partialLinkText("(unsafe)")).click();
		
	}
}
