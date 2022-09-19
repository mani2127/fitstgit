package org.findelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Log in").click();
		
		driver.findElementByName("email").sendKeys("manikram27@gmail.com");
		
		driver.findElementByName("password").sendKeys("rajanparu95");
		
		driver.findElementByXPath("//button[@class='button is-primary'][1]").click();
		
		WebElement text = driver.findElementByXPath("//h1[.=' LetCode with Koushik']");
		String s=text.getText();
		System.out.println(s);
		
		
	
		
		
		
	}
}
