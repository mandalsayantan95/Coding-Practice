package Base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
	File file1 = new File("C:\\Users\\1121416\\Documents\\GE Confidential\\Jars and drivers\\chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", file1.getAbsolutePath());
    WebDriver driver = new ChromeDriver();
         
	
	driver.get("");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	 
	

		

	}

}
