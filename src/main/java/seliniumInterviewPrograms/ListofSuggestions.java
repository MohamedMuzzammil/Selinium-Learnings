package seliniumInterviewPrograms;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox= driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("Muzzammil");
		Thread.sleep(5000);
		List<WebElement> suggestinbox=driver.findElements(By.xpath("//ul[@role='listbox']//folliwing::li"));
		for (WebElement webElement : suggestinbox) {
			System.out.println(webElement.getText());
		}
	}

}
