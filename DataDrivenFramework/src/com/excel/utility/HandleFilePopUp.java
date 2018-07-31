package com.excel.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFilePopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/khaiyum.mohammad/eclipse-workspace/testingproject/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\khaiyum.mohammad\\Desktop");
	}

}
