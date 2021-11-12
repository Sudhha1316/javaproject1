package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com");
	String title = driver.getTitle();
	System.out.println("TITLE :"+title);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	String currentUrl = driver.getCurrentUrl();
	System.out.println("URL  :"+currentUrl);
	Thread.sleep(3000);
	driver.navigate().back();
	String pageSource = driver.getPageSource();
	System.out.println("PAGESOURSE :"+pageSource);
	Thread.sleep(1000);
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
	
}
}
