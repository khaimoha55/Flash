package com.excel.utility;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/khaiyum.mohammad/eclipse-workspace/testingproject/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://beta.addisonlee.com/al/sign-in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//to get the no of counts of links in page 
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		// To get the text of the each links on the page
		
		for(int i=0; i<linkList.size(); i++) {
		String linkText = linkList.get(i).getText();
		System.out.println(linkText);
				
			
		}
		
		
		
	}

}
