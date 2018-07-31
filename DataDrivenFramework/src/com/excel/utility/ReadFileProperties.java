package com.excel.utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFileProperties {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/khaiyum.mohammad/eclipse-workspace/DataDrivenFramework/com.properties");
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdrive.chrome.driver", "C:/Users/khaiyum.mohammad/eclipse-workspace/restapi/src/main/java/com/qa/configuration/config.properties");
			 driver = new ChromeDriver();
			}
		else if(browserName.equals("ff")) {
		
		System.setProperty("webdrive.chrome.driver", "C:/Users/khaiyum.mohammad/eclipse-workspace/restapi/src/main/java/com/qa/configuration/config.properties");
		 driver = new FirefoxDriver();
		}
		
		driver.get(url);
	}
}
