package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");

		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.accept();

		WebElement Confirmdialog = driver.findElement(By.id("j_idt88:j_idt93"));
		Confirmdialog.click();
		Alert Confirm = driver.switchTo().alert();
		Confirm.dismiss();

//	WebElement Inspect = driver.findElement(By.id("j_idt88:j_idt95"));
//Inspect.click()
		

		WebElement prompt = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		prompt.click();
		Alert prompt1 =driver.switchTo().alert();
		prompt1.sendKeys("Selinium");
		prompt1.accept();
		
		
	}

}
