package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificateTest 
{

	public static void main(String[] args) 
	{
		
		// Customzising the chromebrowser for the SSL certicates
		
		DesiredCapabilities	 ch = DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
		
		
		


	}

}
