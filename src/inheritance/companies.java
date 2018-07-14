package inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class companies extends Inheritance {
	
	public static void main(String[] args){
	companies com1=new companies();
	com1.adminlogin();
	WebElement element = driver.findElement(By.linkText("Companies"));
	Actions a1 = new Actions(driver);
    a1.moveToElement(element).build().perform();
    driver.findElement(By.linkText("New Company")).click();
    String url=driver.getCurrentUrl();
    System.out.println(url);
    driver.close();
    
	}
	
}
