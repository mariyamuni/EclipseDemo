package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maria\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		Thread.sleep(5000);
		WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("https://www.google.com/");
	      // identify element
	      Thread.sleep(10000);
	      WebElement p=driver.findElement(By.name("q"));
	      //enter text with sendKeys() then apply submit()
	      p.sendKeys("Selenium Java");
	      Thread.sleep(20000);
	      // Explicit wait condition for search results
	      WebDriverWait w = new WebDriverWait(driver, 5);
	      Thread.sleep(5000);
	      w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
	      p.submit();
	      //driver.close();
	}

}
