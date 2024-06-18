package seliniumInterviewPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printlinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox= driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("Amazing" +Keys.ENTER);
		
			Thread.sleep(5000);
		List<WebElement> totalLinks=driver.findElements(By.xpath("//a"));
		for (WebElement webElement : totalLinks) {
			System.out.println(webElement.getAttribute("href"));
		
	}
}
}
