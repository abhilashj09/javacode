package com.xworkz.register.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium downloads\\Chrome webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/xworkz-selenium/");
		
//		driver.findElement(By.className("active")).click();
		
//		 driver.findElement(By.name("email")).sendKeys("abhilash@gmail.com");;
		 
//		 driver.findElement(By.id("email")).sendKeys("abhilash@gmail.com");;
		 
//		 driver.findElement(By.linkText("Login")).click();
		 
		driver.findElement(By.partialLinkText("Login")).click(); //not generally used
		
 List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

		
		int size = listOfLinks.size();
		System.out.println(size);
		
		for (WebElement webElement : listOfLinks)
		System.out.println(webElement.getText());
		
		
		
		
		 
		
		

	}

}
