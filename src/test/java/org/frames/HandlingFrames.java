package org.frames;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandlingFrames {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("firstFr");
		
		WebElement txt =driver.findElementByName("fname");
		txt.sendKeys("Manikandan");
		driver.findElementByName("lname").sendKeys("R");
		
		WebElement frame = driver.findElementByXPath("//iframe[@src = 'innerFrame']");
		driver.switchTo().frame(frame);
		driver.findElementByName("email").sendKeys("manikram27@gmail.com");
		
		Thread.sleep(3000);
		
		File src =driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img4.png");
		FileHandler.copy(src, des);
		
		
		driver.quit();
	
	}

}
