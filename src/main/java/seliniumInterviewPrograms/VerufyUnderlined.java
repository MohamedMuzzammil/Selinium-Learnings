package seliniumInterviewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerufyUnderlined {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://google.co.in");
WebElement gmail=driver.findElement(By.className("gb_I"));
String beforeHovering=gmail.getCssValue("text-decoration");
System.out.println("Before Hovering " +beforeHovering);

Actions actions=new Actions(driver);
actions.moveToElement(gmail);
actions.perform();
String Afterhovering=gmail.getCssValue("text-decoration ");
System.out.println("After Hovering " +Afterhovering);



	}

}
