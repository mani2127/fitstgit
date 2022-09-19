package org.actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DragAndDropBy {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/draggable");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElementById("sample-box");
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(ele, x+10, y+10).perform();;
		
		Thread.sleep(3000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img4.png");
		FileHandler.copy(src, des);
		driver.quit();
		
		
	}

}
