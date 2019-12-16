package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gitday2 {
	static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasi\\eclipse-workspace\\Reusable\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);				
						 }
	public static void dragNDrop(WebElement e, WebElement t) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(e, t).perform();
		System.out.println("changed one min ago");
}
	}
