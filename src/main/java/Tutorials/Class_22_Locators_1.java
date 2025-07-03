package Tutorials;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class_22_Locators_1 {

	public static void main(String[] arr) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();

		WebElement feature = driver.findElement(By.linkText("Features"));
		System.out.println("Feature Clicked");
		feature.click();

		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		WebElement costomer = driver.findElement(By.linkText("Customer"));
		System.out.println("Customer Clicked");
		costomer.click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		/*// Take ScreenShot
		 * try { File screenshot = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE); File destination = new
		 * File("opencart.png"); FileHandler.copy(screenshot, destination);
		 * System.out.println(" Saving ScreenShot" + destination.getAbsolutePath()); }
		 * catch (IOException e) { System.out.println("Error Saving ScreenShot" +
		 * e.getMessage());
		 * 
		 * }
		 */
		
		WebElement blog = driver.findElement(By.xpath("//a[text()='Blog']")); //<li><a href="https://www.opencart.com/blog">Blog</a></li>
		System.out.println("Blog Clicked");
		blog.click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		WebElement demo = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Demo']")); //selectorHub Exetention
		System.out.println("Demo Clicked");
		demo.click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
//		WebElement download = driver.findElement(By.linkText("Download"));
		WebElement download = driver.findElement(By.xpath("//a[text()='Download']")); //<li><a href="https://www.opencart.com/index.php?route=cms/download">Download</a></li>
		System.out.println("Download Clicked");
		download.click();
		
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // for scroll the page
		js.executeScript("window.scroll(0,100);");
		System.out.println("0");
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scroll(100,400);");
		System.out.println("1");
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scroll(400,1000);");
		System.out.println("2");
		
		WebElement home = driver.findElement(By.cssSelector("a.navbar-brand")); // tag.class
		home.click();
		System.out.println("Home Clicked");

		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//WebElement register = driver.findElement(By.cssSelector("a[href*='route=account/register']")); // tag.attribute (NOT WORKING)
		WebElement register = driver.findElement(By.cssSelector("a.btn.btn-black.navbar-btn")); // tag.class
        register.click();
		System.out.println("Register Clicked");
		
	}

}
