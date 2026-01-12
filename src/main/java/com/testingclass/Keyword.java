package com.testingclass;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Keyword {
	//static so only one copy of WebDriver instance will be created.
	public static WebDriver driver=null;
	public static FluentWait<WebDriver>wait=null;
	
	public void launchBrowser(String browserName) {

		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();
		}else if(browserName.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else {
			throw new InvalidBrowserName(browserName);
		}
		wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);

}
	public WebElement waitForElementToVisible(By by) {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	    return driver.findElement(by);
	}

	
		public void launchURL(String url) {
			driver.get(url);
		}
		
		public void enterText(String locator,String textToEnter) {
		driver.findElement(By.xpath(locator)).sendKeys(textToEnter);
		}
		
		
		public void clickable(String locator) {
			driver.findElement(By.xpath(locator)).click();
		}

}
