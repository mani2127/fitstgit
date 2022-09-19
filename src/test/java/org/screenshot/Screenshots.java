package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		

	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		driver.manage().window().maximize();
		
		//by dom
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img1.png");
		FileHandler.copy(src, des);
		
		//by element
		WebElement ele = driver.findElementById("home");
		File src1 =ele.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./snaps/img2.png");
		FileHandler.copy(src1, des1);
		
		//by section
		WebElement sec =driver.findElementByClassName("card-content");
		File src2 =sec.getScreenshotAs(OutputType.FILE);
		File des2 = new File("./snaps/img3.png");
		FileHandler.copy(src2, des2);
		
		driver.quit();
		
		
	}
}
