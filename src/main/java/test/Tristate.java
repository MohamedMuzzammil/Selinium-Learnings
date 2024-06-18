package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tristate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		
		
        WebElement triStateCheckbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
        
        Actions actions = new Actions(driver);
        actions.moveToElement(triStateCheckbox).click().perform();
        actions.moveToElement(triStateCheckbox).click().perform();
        actions.moveToElement(triStateCheckbox).click().perform();


        
       
    }

	}


