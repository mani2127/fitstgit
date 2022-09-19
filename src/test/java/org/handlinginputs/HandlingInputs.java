package org.handlinginputs;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		driver.manage().window().maximize();
		
		driver.findElementById("fullName").sendKeys("Manikandan");
		
		driver.findElementById("join").sendKeys(" person", Keys.TAB);
		
		String get = driver.findElementById("getMe").getAttribute("value");
		System.out.println(get);
		
		driver.findElementById("clearMe").clear();
		
		boolean s =driver.findElementById("noEdit").isEnabled();
		System.out.println(s);
		
		String s1 =driver.findElementById("dontwrite").getAttribute("value");
		System.out.println(s1);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
