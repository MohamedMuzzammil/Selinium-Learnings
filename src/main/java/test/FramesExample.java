package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		String firsttxt = driver.findElement(By.id("Click")).getText();
		System.out.println(firsttxt);
		driver.switchTo().defaultContent();
		
		List<WebElement> secondframe= driver.findElements(By.tagName("iframe"));
		int total=secondframe.size();
        System.out.println(total);
        
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");

        WebElement nestedframe=driver.findElement(By.id("Click"));
        nestedframe.click();

		
		
	}
}
