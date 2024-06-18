package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement dropdown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(dropdown1);

		select.selectByIndex(1);

		List<WebElement> listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println("Number of options :" + size);

		dropdown1.sendKeys("Cypress");

		WebElement courseName = driver.findElement(By.id("j_idt87:auto-complete_input"));
		courseName.sendKeys("Java");

		WebElement language = driver.findElement(By.xpath("//*[@id=\'j_idt87:lang\']"));
		Select lang = new Select(language);
		lang.selectByIndex(1);

//		WebElement dropdown2= driver.findElement(By.id("j_idt87:country_label"));
//		Select select1 = new Select(dropdown2);
//        select1.selectByIndex(3);

	}
}
