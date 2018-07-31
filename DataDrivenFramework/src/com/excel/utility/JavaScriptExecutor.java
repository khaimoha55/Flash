package com.excel.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
	
		drawBorder(loginBtn, driver );
		
	}
	
	
	public static void sum(int i ) {
		
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver ) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);		
	}
	
	
	
	
	
	
	

}
