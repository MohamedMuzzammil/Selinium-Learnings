package test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		WebElement typenameBox = driver.findElement(By.name("j_idt88:name"));
		typenameBox.sendKeys("Mohamed");

		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys(" is so hot");

		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div[3]/div"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);

		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();

		WebElement retrievalBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = retrievalBox.getAttribute("value");
		System.out.println(text);

		WebElement emailBox = driver.findElement(By.name("j_idt88:j_idt99"));
		emailBox.sendKeys("Mohamed@yahoo.com");

	}

}
