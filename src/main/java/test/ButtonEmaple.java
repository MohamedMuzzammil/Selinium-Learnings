package test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonEmaple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		WebElement disabledbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
		boolean enabled = disabledbutton.isEnabled();
		System.out.println(enabled);

		WebElement positionbutton = driver.findElement(By.id("j_idt88:j_idt94"));
		int xValue = positionbutton.getLocation().getX();
		int yVvalue = positionbutton.getLocation().getY();
		System.out.println("The X value is :" + xValue + " The Y value is :" + yVvalue);

		WebElement findColorbutton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = findColorbutton.getCssValue("background");
		System.out.println(color);

		WebElement heightwidthbutton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = heightwidthbutton.getSize().getHeight();
		int width = heightwidthbutton.getSize().getWidth();
		System.out.println("The height is :" + height + "The width is :" + width);

		WebElement element = driver.findElement(By.id("j_idt88:j_idt100"));
		String beforepointing = element.getCssValue("background");
		System.out.println(beforepointing);

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		WebElement element1 = driver.findElement(By.id("j_idt88:j_idt100"));
		String aftermovement = element1.getCssValue("background");
		System.out.println(aftermovement);

		if (!beforepointing.equals(aftermovement)) {
			System.out.println("Color changed after mouse over");
		} else {
			System.out.println("Color did not change after mouse over");
		}
//		WebElement findrounfbuttons= driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div/div[2]/div[4]"));
//		
//		String roundboxes =findrounfbuttons.getAttribute("How many rounded buttons are there?");
//		   System.out.println("Number of rounded buttons: " + roundboxes);
		
	}

}
