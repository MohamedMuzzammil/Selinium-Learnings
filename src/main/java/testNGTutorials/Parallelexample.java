package testNGTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelexample {
	
	@Test
	public void openchrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		driver.quit();
	}

	@Test
	public void openbing() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to("http://www.bing.com");
		driver.quit();

	}
}
