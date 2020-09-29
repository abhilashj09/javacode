package com.xworkz.register;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","D:\\Selenium downloads\\Chrome webdriver\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","D:\\Selenium downloads\\Firefox driv\\geckodriver.exe");

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the name of browser");
	String browser = scan.next();
	scan.close();
	
//	RemoteWebDriver chrome = new ChromeDriver();
	//WebDriver firefox = new FirefoxDriver();
	//SerachContext d = new ChromeDriver();
	//JavascriptExecutor d1 = new ChromeDriver();
	//TakeScreenshot d2 = new ChromeDriver();
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}
	else 
	{
		System.out.println("invadlid browserr");

}
}
}

