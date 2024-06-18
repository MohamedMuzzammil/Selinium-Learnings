package testNGTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long beforetime;

	@BeforeSuite(groups = {"Startpoint"})
	public void openbrowser() {
		beforetime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(groups = {"Google"})
	public void openGoogle() {
		driver.get("http://www.google.co.in");
	}

	@Test(groups = {"Bing"})
	public void openBing() {
		driver.get("http://www.Bing.com");
	}

	@Test(groups = {"Yahoo"})
	public void openyahoo() {
		driver.get("http://www.Yahoo.co.in");
	}

	@AfterSuite(groups = {"End"})
	public void closebrowser() {
		driver.quit();
		long closetime = System.currentTimeMillis();
		long totaltime = closetime - beforetime;
		System.out.println(totaltime);

	}

}
