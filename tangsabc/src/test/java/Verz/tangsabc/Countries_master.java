package Verz.tangsabc;
import java.util.List;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basetangs.base;

public class Countries_master extends Base_Countries{
		
  @Test
  public void f()  throws InterruptedException{
	  
	  driver.findElement(By.ByXPath.xpath("//a[@class='btn btn-primary default mb-1']")).click();
	  driver.findElement(By.ById.id("home-tab")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.ByXPath.xpath("//*[@id=\"masterfiles-name\"]")).sendKeys("Vietnam4");

	  driver.findElement(By.ById.id("masterfiles-ordering")).sendKeys("20");
	  
	  
	  driver.findElement(By.ByXPath.xpath("//button[@class='btn btn-primary']")).click();
	  
	  Thread.sleep(2000);
	    
	  WebElement elementct = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.ByXPath.xpath("//*[@id=\"app-container\"]/main/div/div[3]")));  
	  System.out.println(elementct.getText());
	  assertTrue(elementct.getText().contains("Country of Residence has been created successfully.")); 
	  
	  
	  
  
		  	 
  }
}
