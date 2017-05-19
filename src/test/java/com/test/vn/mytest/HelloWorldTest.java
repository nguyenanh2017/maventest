package com.test.vn.mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	@Test
	public void login(){
		System.out.println("login abcbcbc");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nguyenanh\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.quit();
       
	}
}
