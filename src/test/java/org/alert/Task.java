package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame("iframeResult");
			
		    driver.findElementByXPath("//button[@onclick='myFunction()']").click();
			
			
			Alert a = driver.switchTo().alert();
			a.sendKeys("Manikandan");
			a.accept();
			
			String s = driver.findElementById("demo").getText();
			System.out.println(s);
			
			driver.quit();
			
			
		
		
	}
}
