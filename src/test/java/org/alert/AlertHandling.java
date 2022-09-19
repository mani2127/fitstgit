package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		driver.manage().window().maximize();
		
		//Simple Alert
		WebElement simple = driver.findElementById("accept");
		simple.click();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		System.out.println(s);
		a.accept();
		
		//confirm alert
		WebElement confrim =driver.findElementById("confirm");
		confrim.click();
		Alert b =driver.switchTo().alert();
		String s1 =b.getText();
		System.out.println(s1);
		b.dismiss();
		
		//Prompt Alert
		WebElement prompt = driver.findElementById("prompt");
		prompt.click();
		Alert c =driver.switchTo().alert();
		c.sendKeys("Manikandan");
		c.accept();
		WebElement print = driver.findElementById("myName");
		System.out.println(print.getText());
		
		driver.quit();
	}
}
