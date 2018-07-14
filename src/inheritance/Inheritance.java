package inheritance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Inheritance {
	public static WebDriver driver=new ChromeDriver();
	public void adminlogin(){
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
		driver.get("https://www.crmpro.com/index.html");
		driver.manage().window().maximize();
	 	driver.get("https://www.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Chaitanya509");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("Chaithu$509");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		}
	public  static void main(String args[]){
		Inheritance In=new Inheritance();
		In.adminlogin();
	}
	}
