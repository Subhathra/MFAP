package com.neosis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

 

public class MyFirstSeleniumScript {
	
	
	/*static WebDriver driver = new FirefoxDriver();*/	
	
	public static WebDriver driver;

	@BeforeClass
	public void setUpSeleniumDriver() {
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Training\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
	
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		

		// Tell the Java bindings to use Marionette.
		// This will not be necessary in the future,
		// when Selenium will auto-detect what remote end
		// it is talking to.

	}
	 
	
	//@Test
	//public static void yahooTest() throws InterruptedException {

	
		//WebElement gotolink = driver.findElement(By.xpath("//a[@href='https://in.finance.yahoo.com/']"));
		//je.executeScript("arguments[0].scrollIntoView(true);",gotolink);
		//gotolink.click();
		//Thread.sleep(3000);
		//WebElement scrollstocks = driver.findElement(By.xpath("//button[@title='previous'][@data-reactid='67']"));
		//scrollstocks.click();
		//Thread.sleep(3000);
		//WebElement scrollstocks1 = driver.findElement(By.xpath("//button[@title='next'][@data-reactid='70']"));
        //scrollstocks1.click();
        //WebElement latestnews = driver.findElement(By.xpath("//a[@href='/personal-finance'][@data-reactid='23']"));
        //latestnews.click();	
        //JavascriptExecutor jse = (JavascriptExecutor)driver;	
        //jse.executeScript("window.scrollBy(0,250)", "");
        
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //jse.executeScript("window.scrollBy(0,-250)", "");
        //WebElement insurance = driver.findElement(By.xpath("//a[@href='/topic/insurance']"));
        //insurance.click();
        //WebElement backhome = driver.findElement(By.id("uh-tb-home"));
        //backhome.click();
        //WebElement lifestyle = driver.findElement(By.xpath("//a[@href='https://in.style.yahoo.com/'][@data-rapid_p='34']"));
              
       
	//}
	
	//@Test
	//public static void googleTest() throws InterruptedException{
	//String pageTitle = driver.getTitle();
	//System.out.println("Page Title is " + pageTitle);
	//}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
