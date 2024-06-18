package seliniumInterviewPrograms;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffrentWaysToSendKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		WebElement searchbox= driver.findElement(By.className("gLFyf"));
////		searchbox.sendKeys("Muzzammil");
		
		
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("document.getElementsByClassName('gLFyf')[0].value='Muzzammil' ", "");
		
		
		
		
	}

}
