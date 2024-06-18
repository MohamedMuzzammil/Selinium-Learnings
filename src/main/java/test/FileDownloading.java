package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloading {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement downloadFile = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
		downloadFile.click();
		Thread.sleep(3000);

		File download = new File("\"C:\\Users\\Hi\\Downloads\"");
		File[] totolfiles = download.listFiles();
		for (File file : totolfiles) {
			if (file.getName().equals("TestLeaf Logo")) {
				System.out.println("The File is Downloaded");
				break;
			}
		}

	}

}
