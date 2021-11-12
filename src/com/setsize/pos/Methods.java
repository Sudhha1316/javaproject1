package com.setsize.pos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement newuser = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	newuser.click();
	Thread.sleep(3000);
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("Sudha");
	WebElement last = driver.findElement(By.name("lastname"));
	last.sendKeys("P");
	WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	fname.sendKeys("Sudha");
	WebElement passw = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	passw.sendKeys("76543210");
	WebElement gend = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	gend.click();
	WebElement sgnup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	sgnup.click();
	Thread.sleep(3000);
	TakesScreenshot shot = (TakesScreenshot) driver;
	File source = shot.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\screenshot\\error.jpeg");
	FileUtils.copyFile(source, destination);
	
	driver.quit();
	
}
}
