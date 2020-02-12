package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\java\\ProjectAir\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
