package org.browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String s =driver.getTitle();
		System.out.println(s);
		
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		
		driver.quit();
		
	}

}
