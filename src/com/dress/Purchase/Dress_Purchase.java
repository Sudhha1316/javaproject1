package com.dress.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dress_Purchase {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		Thread.sleep(3000);

}
}
