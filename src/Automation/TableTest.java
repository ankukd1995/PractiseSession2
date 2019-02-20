package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest 
{ 
 
	public static void main(String[] args) throws InterruptedException 
	 
	{
		int sum=0;
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21356/nk-vs-cd-final-super-smash-2018-19");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Printing the runs of the all 11 player
		WebElement table = driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1)")); 
		// Parent to child
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(4)")).size();
		
		for(int i=0;i<count;i++)
		{
			String add = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int summation = Integer.parseInt(add);
			sum= sum+summation;
				
		}
		
	
		 // Child to child
		 String extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		 
		 // Converting the string value into the integer
		 int extrasvalue = Integer.parseInt(extras);
		 
		 // Adding the all the values
		 int total =  sum+extrasvalue;
		 
		 //Printing the calculated total value
		 System.out.println("Calculated total of the player:" + total );
		 
		 // Getting the display total value
		 String display = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		 
		 // Converting the string value into the integer
		 int show = Integer.parseInt(display);
		 
		 //Printing the Display total value
		 System.out.println("Display total of the screen:" + show);
		 
		 // Checking the equality of the total
		 if(total == show)
		 {
			 System.out.println("Total matches");
		 }
		 
		 

	} 
 
}  
