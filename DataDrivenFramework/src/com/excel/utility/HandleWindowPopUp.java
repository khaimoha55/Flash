package com.excel.utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleWindowPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/khaiyum.mohammad/eclipse-workspace/testingproject/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='black']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowHanle = it.next();
		System.out.println("parent window id:"+ parentWindowHanle );
		
		String childWindowHandle = it.next();
		System.out.println("child window id:" + childWindowHandle );
		
		
		driver.switchTo().window(childWindowHandle);
		System.out.println("child window pop up title:" + driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(parentWindowHanle);
		System.out.println("parent window pop up title:" + driver.getTitle());
		

	}

}
