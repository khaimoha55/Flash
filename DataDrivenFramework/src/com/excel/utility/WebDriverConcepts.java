package com.excel.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConcepts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/khaiyum.mohammad/eclipse-workspace/DataDrivenFramework/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		//print the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//to check weather title is correct or not 
		if(title.equals("Google")) {
			System.out.println("Current title");
		}
		else {
			System.out.println("incorrect title ");
		}

		// to check the currect url
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
}
}
