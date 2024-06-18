package Seliniumtrails;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MessageBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/messages.xhtml");
		WebElement firstName = driver.findElement(By.id("j_idt100:firstname"));
		firstName.sendKeys("Mohamed");
		WebElement secondName = driver.findElement(By.id("j_idt100:lastname"));
		secondName.sendKeys("Muzzammil");
		WebElement emailBox=driver.findElement(By.id("j_idt100:email"));
		emailBox.sendKeys("Muzz@hotmail.com");
		WebElement submitButton=driver.findElement(By.id("j_idt100:submitButton"));
		submitButton.click();
		
		WebElement warmalert =driver.findElement(By.xpath("//*[@id=\"j_idt94:j_idt96\"]/span"));
		warmalert.click();
	
		
		

	}

}
