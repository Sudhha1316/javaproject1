package com.dynamictable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {
	public static void main(String[] args) throws InterruptedException {
	
		int country_Index,total_Case_Index =0,total_Death_Index =0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> all_Headers = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < all_Headers.size(); i++) {
			String header = all_Headers.get(i).getText();
			header = header.replaceAll("\n", " ");
			System.out.println(header);
			if (header.contains("Country")) {
				country_Index = i;
				System.out.println("Country Index "+country_Index);
			}
			else if (header.equalsIgnoreCase("Total deaths")) {
				total_Death_Index = i;
				System.out.println("Total Deaths "+total_Death_Index);
			}
			else if (header.equals("Total cases")) {
				total_Case_Index = i;
				System.out.println("Total cases "+total_Case_Index);
			}
		}
		System.out.println("***********************************");
}
}
