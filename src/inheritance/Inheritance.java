package inheritance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Inheritance {
public WebDriver driver;
@BeforeTest
public void initiatebrowser()
	{
	    driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		driver.get("https://www.crmpro.com/index.html");
	}
		@Test
		 public void CRM(){
		
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Chaitanya509");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("Chaithu$509");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		}
	}
