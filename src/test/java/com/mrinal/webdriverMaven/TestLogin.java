package com.mrinal.webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestLogin {

	public static WebDriver driver;
	@BeforeSuite
	public void startConnection() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD056549\\Documents\\Seleniumstuff\\chromedriver.exe");
         driver=new ChromeDriver();
         
		}
		
	@Test
	public void doLogin() {
		
		driver.get("https://www.gmail.com/");
	}
	
	@AfterSuite
	public void teatDown() {
		
		driver.quit();
	}
	
	}

