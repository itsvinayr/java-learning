package com.java.learning.completeJava.problemStatements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTests {

	WebDriver driver = null;

	@BeforeTest
	public void initialize() {
		driver = null;
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@Test
	public void testExplicitWait() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Testing");
		element.submit();
		sleep();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Software testing - Wikipedia")));
		ele.click();
		sleep();
	}

	@Test
	public void testScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("SoftwareTestingHelp");
		element.sendKeys(Keys.ENTER);
		sleep();
		js.executeScript("window.scrollBy(0,1000)");
		sleep();

		/*
		 * To scroll till the element is found
		 */
		/*
		 * //Find element by link text and store in variable "Element" WebElement
		 * Element = driver.findElement(By.linkText("Linux"));
		 * 
		 * //This will scroll the page till the element is found
		 * js.executeScript("arguments[0].scrollIntoView();", Element);
		 */

		/*
		 * To scroll till the webpage ends
		 */
		/*
		 * //This will scroll the web page till end.
		 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 */
	}

	@Test
	public void getAllLinks() {
		String href = null;
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		for (WebElement element : allElements) {
			href = element.getAttribute("href");
			System.out.println(href);
		}
	}

	@Test
	public void checkForBrokenLinks() throws MalformedURLException, IOException {
		String href = null;
		HttpURLConnection httpURLConnection = null;
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		for (WebElement element : allElements) {
			href = element.getAttribute("href");
			httpURLConnection = (HttpURLConnection) new URL(href).openConnection();
			httpURLConnection.setRequestMethod("HEAD");
			httpURLConnection.connect();
			int responseCode = httpURLConnection.getResponseCode();
			if (responseCode >= 400) {
				System.out.println("Response Code -- " + responseCode + " -- Its a broken link -- " + href);
			} else {
				System.out.println("Response Code -- " + responseCode + " -- success " + href);
			}
		}
	}

	@Test
	public void switchToPreviousTabs() throws AWTException {
		
		WebElement element1 = driver.findElement(By.name("q"));
		element1.sendKeys("software testing help");
		element1.sendKeys(Keys.ENTER);
		sleep();
		String a = Keys.chord(Keys.CONTROL, Keys.RETURN);
		System.out.println("String representation of chord --- "+a);
		driver.findElement(By.partialLinkText("Software Testing Help - A Must Visit Software Testing Portal"))
				.sendKeys(a);
		sleep();
		Robot robot = new Robot(); // instantiated robot class
		robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the
												// shortcut keys
		sleep();
		robot.keyPress(KeyEvent.VK_2); // here, we have just pressed ctrl+2
		sleep();
		robot.keyRelease(KeyEvent.VK_CONTROL); // once we press and release ctrl+2, it will go to the second tab.
		sleep();
		robot.keyRelease(KeyEvent.VK_2); // if you again want to go back to first tab press and release vk_1
		sleep();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	public void sleep() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
