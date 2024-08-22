package com.selenium;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test2 {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("mail.google.com");
		WebElement u = driver.findElement(By.id("username"));
		u.sendKeys("kumardaala@gmail.com");
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("Kumar_daala@01");
		
		driver.findElement(By.id("login")).click();
	}

}
