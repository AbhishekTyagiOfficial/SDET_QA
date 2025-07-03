package Tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver firefox = new FirefoxDriver();
		firefox.get("https://demo.opencart.com");
		firefox.getCurrentUrl();
	}

}
