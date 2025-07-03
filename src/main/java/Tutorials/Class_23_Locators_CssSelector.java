package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_23_Locators_CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		//WebElement search = driver.findElement(By.id("small-searchterms")); //id
		WebElement search = driver.findElement(By.cssSelector("input#small-searchterms")); // tag.Id
		System.out.println("Search Clicked");
		search.sendKeys("Iphone 13");	
		
		WebElement searchBtn = driver.findElement(By.cssSelector("button.button-1.search-box-button")); // tag.class
		System.out.println("SearchBtn Clicked");
		searchBtn.click();
	}

}
