package basetangs;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class base {
	
	public WebDriver driver;
  
	@BeforeTest
	public void beforeTest() {
		
		File driverFireFox = new File("src/driver/geckodriver.exe");
		File driverChrome = new File("src/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", driverFireFox.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", driverChrome.getAbsolutePath());
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		//System.out.println("abvdg");
		

	}
	
		@AfterClass
	public void afterClass(){
		//driver.quit();
	}

}
