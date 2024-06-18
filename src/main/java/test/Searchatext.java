package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchatext {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver;
driver = new ChromeDriver();
driver.get("http://google.co.in");
driver.findElement(By.className("gLFyf")).sendKeys("Erode Weather"+Keys.ENTER);

	}

	}


