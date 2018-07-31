package com.excel.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive. chrome. driver", "C:/Users/khaiyum.mohammad/eclipse-workspace/DataDrivenFramework/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		
		//validation
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("incorrect text ");
			
			alert.accept();
		}
		
		

	}

}
