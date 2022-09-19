package org.navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCmds {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		driver.manage().window().maximize();
		
		String s = driver.getCurrentUrl();
		System.out.println("Button page url "+s);
		
		Thread.sleep(3000);
		
		driver.findElementById("home").click();
		
		String s1 = driver.getCurrentUrl();
		System.out.println("Home page Url "+s1);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		String s2 = driver.getCurrentUrl();
		System.out.println("Back to button pageurl "+s2);
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://letcode.in/signin");
		String s3 = driver.getCurrentUrl();
		System.out.println("Login page url "+s3);
		
		driver.quit();
		
		
		
		
	}

}
