package org.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElementByXPath("//button[.='✕']").click();
		
			WebElement ele = driver.findElementByXPath("//div[.='Electronics']");
			
			Actions builder = new Actions(driver);
			
			builder.moveToElement(ele).perform();
			
			driver.findElementByLinkText("Audio").click();
			
			Thread.sleep(5000);
			
			driver.quit();
	}
}
