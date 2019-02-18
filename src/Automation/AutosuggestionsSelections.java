package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionsSelections 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AutosuggestionsSelections auto = new AutosuggestionsSelections ();
		auto.dropdown(driver);
		

	}

	public void dropdown(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,300)");
		 
		// Entering the text
		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		Thread.sleep(1000);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		
		// Handling the Javascript implementaions
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
	   // Checking the desired element on the dropdown	
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
		}
		
		
		
	}
	
	
}
