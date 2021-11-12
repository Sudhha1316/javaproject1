package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_3 {
	
	public static WebDriver driver ;
	public static void browser_Launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static void input_Value(WebElement s ,String s1){
		s.sendKeys(s1);
	}
	public static void clickonElement(WebElement clk) {
		clk.click();
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
	public static void navigate_Back() {
		driver.navigate().back();
	}
	public static void navigate_Forward() {
		driver.navigate().forward();
	}
	
}
