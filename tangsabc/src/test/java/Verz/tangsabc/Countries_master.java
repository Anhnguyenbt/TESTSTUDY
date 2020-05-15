package Verz.tangsabc;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basetangs.base;

public class Countries_master extends Base_Countries{
		
  @Test
  public void createcountrie()  throws InterruptedException{
	  
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
	  driver.findElement(By.ByXPath.xpath("//button[@class='btn btn-light']")).click();
	  Thread.sleep(2000);
		  	 
  }
	// udpate countrie china
@Test
public void updatename()  throws InterruptedException{
	
	Random rd = new Random();
	int textname = rd.nextInt(1000);

driver.findElement(By.ByXPath.xpath("//tr[1]//td[5]//a[2]//i[1]")).click();
driver.findElement(By.ByXPath.xpath("//*[@id=\"home-tab\"]")).click();
WebElement elementclear = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.ByXPath.xpath("//*[@id=\"masterfiles-name\"]"))); 
elementclear.clear();
driver.findElement(By.ByXPath.xpath("//*[@id=\"masterfiles-name\"]")).sendKeys("China"+textname);
driver.findElement(By.ByXPath.xpath("//button[@class='btn btn-primary']")).click();	  
Thread.sleep(2000);	    
WebElement elementct = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.ByXPath.xpath("//*[@id=\"app-container\"]/main/div/div[3]")));  
System.out.println(elementct.getText());
assertTrue(elementct.getText().contains("Country of Residence has been updated successfully."));  
  	 
}
}
