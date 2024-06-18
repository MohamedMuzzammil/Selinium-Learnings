package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		String oldwindow = driver.getWindowHandle();
		WebElement firstwindow = driver.findElement(By.id("j_idt88:new"));
		firstwindow.click();
		Set<String> handleswindows = driver.getWindowHandles();
		for (String newwindow : handleswindows) {
			driver.switchTo().window(newwindow);
		}
		Thread.sleep(3000);
		WebElement message = driver.findElement(By.id("message"));
		message.sendKeys("Hi!! Iam Muzzammil and Iam studying Selinium");
		driver.close();
		driver.switchTo().window(oldwindow);
		WebElement Secondwindow= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
		Secondwindow.click();
		int noofwindows=driver.getWindowHandles().size();
		System.out.println(noofwindows);
		Set<String> allwindows=driver.getWindowHandles();
		for (String close : allwindows) {
			if(!close.equals(oldwindow)) {
				driver.switchTo().window(close);
				Thread.sleep(3000);
				driver.close();
				
			}
		}
		driver.switchTo().window(oldwindow);
		WebElement thirdWindow= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		
		thirdWindow.click();
		int count=driver.getWindowHandles().size();
		System.out.println(count);
		
		
	}
}
