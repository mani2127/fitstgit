package org.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropable");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement source = driver.findElementById("text");
		
		WebElement target = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(source, target).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
