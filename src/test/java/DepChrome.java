
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DepChrome  {
	
	@Test()
	public void testBrowser() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();        
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);      
        driver.quit();      
    }  
    
   public static void main(String args[]) {
   	DepChrome dtest=new DepChrome();
   	dtest.testBrowser();
 }
}
