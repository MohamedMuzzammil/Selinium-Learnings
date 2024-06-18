package seliniumInterviewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class RefreshWebpage {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
WebElement searchbox= driver.findElement(By.className("gLFyf"));
searchbox.sendKeys("Muzzammil");
driver.get(driver.getCurrentUrl());


	}

}
