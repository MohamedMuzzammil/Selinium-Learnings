package Seliniumtrails;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		WebElement firstAlert=driver.findElement(By.id("j_idt88:j_idt91"));
		firstAlert.click();
		Thread.sleep(2000);
		
		Alert closeAlert=driver.switchTo().alert();
		String text=closeAlert.getText();
		System.err.println(text);
		closeAlert.accept();
		WebElement secondAlert=driver.findElement(By.id("j_idt88:j_idt93"));
		secondAlert.click();
		Alert secondAlert1=driver.switchTo().alert();
		closeAlert.accept();
		
		WebElement thirdAlert=driver.findElement(By.id("j_idt88:j_idt104"));
		thirdAlert.click();
		
		Alert typeAlert=driver.switchTo().alert();
		typeAlert.sendKeys("Muzzammil");
		typeAlert.accept();
		WebElement name=driver.findElement(By.id("confirm_result"));
		String namem=name.getText();
		System.out.println(namem);
		
	
		
		
		
		
		
		
		
	
	        
		
		
	}

}
