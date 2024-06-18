package Seliniumtrails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Muzzammil");
		
		WebElement dOBBox = driver.findElement(By.id("j_idt106:j_idt116_input"));
		dOBBox.sendKeys("08/02/1999");
		
		driver.switchTo().defaultContent();
		
		WebElement numBox= driver.findElement(By.id("j_idt106:j_idt118_input"));
		numBox.sendKeys("50");
		
		
				
		
		
		
		
	}
	
}
