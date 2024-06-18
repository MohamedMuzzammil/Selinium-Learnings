package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpengooglewithFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hi\\Downloads\\geckodriver-v0.34.0-win32");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://google.co.in");
		
		
	}

}
