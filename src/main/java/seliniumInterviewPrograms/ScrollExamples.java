package seliniumInterviewPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.spec.ECField;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExamples {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriver driver=new ChromeDriver();
driver.get("https://en.wikipedia.org/wiki/Harry_Potter");

JavascriptExecutor executor=(JavascriptExecutor)driver;

//Move to some position
//executor.executeScript("window.scroll(0,450)", "");
//Thread.sleep(2000);
//executor.executeScript("window.scroll(0,-450)", "");

//Go to the bottom of the page
//executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
//executor.executeScript("window.scroll(0,0)", "");

//Go to specific element
//WebElement link = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/figure[3]/a/img"));
//executor.executeScript("arguments[0].scrollIntoView(true);", link);

//By using Robot class
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

}
