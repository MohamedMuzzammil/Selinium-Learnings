package testNGTutorials;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	String [][] credentials = null;

	@DataProvider(name = "loginDetails")
	public String[][] dataproviders() throws BiffException, IOException {
		credentials = getvalues();
		return credentials;
	}

	public String[][] getvalues() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream("C:\\Users\\Hi\\Desktop\\Logindetails.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowCount = sheet.getRows();
		int coloumCount = sheet.getColumns();

		String testData[][] = new String[rowCount - 1][coloumCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < coloumCount; j++) {
				testData[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;

	}		

	@Test(dataProvider ="loginDetails")
	public void login(String usern, String pass) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(usern);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		driver.quit();

	}

}
