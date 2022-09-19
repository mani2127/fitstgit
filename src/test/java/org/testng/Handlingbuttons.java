package org.testng;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingbuttons {

	@Test
	public void main() {
		
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://letcode.in/buttons");
			
			driver.manage().window().maximize();
			
			WebElement co = driver.findElementById("position");
			Point a = co.getLocation();
			System.out.println(a.getX());
			System.out.println(a.getY());
		
			WebElement bkclr = driver.findElementById("color");
			String s = bkclr.getCssValue("background-color");
		    System.out.println(s);
		    
		    WebElement prop = driver.findElementById("property");
		    Rectangle d = prop.getRect();
		    System.out.println(d.getWidth());
		    System.out.println(d.getHeight());
			
			driver.quit();
			

		
	}
}
