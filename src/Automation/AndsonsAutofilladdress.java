package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AndsonsAutofilladdress 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://andsons-dev.myshopify.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[@class='js-burger']")).click();
			 Thread.sleep(2000);
			 // click on shop menu
			 driver.findElement(By.xpath("//a[@href='#'][contains(text(),'Shop')]")).click();
			 Thread.sleep(2000);
			 
			 // Clicking on the slider
			 driver.findElement(By.xpath("//div[@class='swiper-container the-box-main-img-slider swiper-container-horizontal']//div[@class='swiper-button-next']")).click();
			 Thread.sleep(2000);
			 
			 // Scrolling down the model
			 
			  Actions a = new Actions(driver);
			  int i=0;
			  while(i<6)
			  {
			  a.sendKeys(Keys.PAGE_DOWN).build().perform();
			  Thread.sleep(1000);
			  i++;
			  } 
			  
			 
			 //Scrolling up the model
			  Actions b = new Actions(driver); 
			  int j=0;
			  while(j<3)
			  {
				b.sendKeys(Keys.PAGE_UP).build().perform();
				Thread.sleep(1000);
				j++;
			 }
				
			  // Adding the product into the card(Signature)
			  // Adding 12-signature
			  driver.findElement(By.xpath("//input[@id='plus']")).click();
			  driver.findElement(By.xpath("//input[@value='add to cart']")).click();
			  Thread.sleep(3000);
			  
			// Adding 36-signature
			  driver.findElement(By.xpath("//label[@for='variant-15950925037602']")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@id='plus']")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@value='add to cart']")).click();
			  Thread.sleep(3000); 
			  
			 // Adding the product into the card(Holiday)
			  // Adding 54-holiday
			  //driver.findElement(By.xpath("//label[@for='variant-15409286283298']")).click();
			  driver.findElement(By.xpath("//label[contains(text(),'Signature Box')]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@value='add to cart']")).click();
			  Thread.sleep(3000); 
			   
			  // Closing the shop model
			  
			  Actions c = new Actions(driver);
			  int k=0;
			  while(k<4)
			  {
			  c.sendKeys(Keys.PAGE_DOWN).build().perform();
			  Thread.sleep(1000);
			  k++;
			    } 
			  
			  driver.findElement(By.xpath("//span[@class='monogran-outter']//img")).click();
			  
			  // Clicking on the checkout logo
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='buybtn-outter']//img")).click();
				Thread.sleep(3000);
				
				Actions z = new Actions(driver);
				int x=0; 
				while(x<2)
				{
					z.sendKeys(Keys.PAGE_DOWN).build().perform();
					x++;
				}
				 
				Thread.sleep(2000);
				 driver.findElement(By.cssSelector("[class='link-btn']")).click();
				Thread.sleep(2000);
				
				// Filling the shipping address
				driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("ankush");		
				driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("pawar");
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ankush_test@mailinator.com");
				 
				// Filling shipping info
				
				driver.findElement(By.xpath("//input[@id='sfirstname']")).sendKeys("ankush");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='slastname']")).sendKeys("pawar");
				driver.findElement(By.id("company")).sendKeys("Cemtrexlabs");
				
				// Entering the Autofill address
				
				driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("45342");
				driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='postal_code']")).click();
			
				
	}

}
