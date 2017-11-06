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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Test
public class Flipcartlogin extends MyFirstSeleniumScript {
   
	WebElement flipkartpageopen, userid, home, password, login, closelogin, logoff, changedetails, edit, editname, editname1, save, editm,email, menu;
	
	private void invalidlogin() {
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		flipkartpageopen.click();
		driver.findElement(By.className("_2zrpKA"));
		userid.sendKeys("9900028591");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
		password.sendKeys("123456");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		login.click();
		driver.findElement(By.className("_2AkmmA _29YdH8"));
		closelogin.click();
	}
	
	private void login() {
	driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
	flipkartpageopen.click();
	driver.findElement(By.className("_2zrpKA"));
	userid.sendKeys("9900028591");
	driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
	password.sendKeys("varsha2015$2");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	login.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	private void makechange() {
			
		driver.findElement(By.className("_1AHrFc _2k0gmP"));
		changedetails.click();
		driver.findElement(By.className("_1x4IU1"));
		edit.click();
		driver.findElement(By.name("firstName"));
		editname.clear(); editname.sendKeys("Usha");
		driver.findElement(By.name("lastName"));
		editname1.clear();editname1.sendKeys("Vaidyanathan");
		driver.findElement(By.className("_2AkmmA rAx-Sv"));
		save.click();
		driver.findElement(By.className("_7qszba oZoRPi"));
		editm.click();
		driver.findElement(By.name("email"));
		email.sendKeys("contactvarsha2015@gmail.com");
		driver.findElement(By.className("email"));
		save.click();		
	}
	private void logout() {
		driver.findElement(By.xpath("//img[@src='//img1a.flixcart.com/www/linchpin/fk-cp-zion/img/fk-logo_9fddff.png']"));
		home.click();
		driver.findElement(By.xpath("//a[@class='_1AHrFc _2k0gmP'][@href='/account/?rd=0&link=home_account']"));
		//Initiate mouse action using Actions class
		Actions builder = new Actions(driver);
		// move the mouse to the earlier identified menu option
		builder.moveToElement(menu).build().perform();
		// wait for max of 5 seconds before proceeding. This allows sub menu appears properly before trying to click on it
		WebDriverWait wait = new WebDriverWait(driver, 5); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li._2f5Jjv:nth-child(8) > a:nth-child(1)")));
		driver.findElement(By.cssSelector("li._2f5Jjv:nth-child(8) > a:nth-child(1)"));
		logoff.click();

	}
	
	
	}
