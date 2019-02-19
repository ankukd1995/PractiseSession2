package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest 
{ 
 
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21356/nk-vs-cd-final-super-smash-2018-19");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1)")); 
		//int rowcount = table.findElements(By.cssSelector("div.cb-col cb-col-100 cb-scrd-itms")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(4)")).size();
		
		for(int i=0;i<count;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		 
	} 
 
}
