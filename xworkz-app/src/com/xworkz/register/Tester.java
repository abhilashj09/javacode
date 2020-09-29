package com.xworkz.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//web driver object cant be created because webdriver its interface

public class Tester {

	public static void main(String[] args) {
		//1)using static method(System.setProperty(String key,STring value);
		//2) copy and paste into project
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium downloads\\Chrome webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String expectedTitle = "amazon";
		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		if(Actualtitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	
		
		
		
		
		
		
	}

}
