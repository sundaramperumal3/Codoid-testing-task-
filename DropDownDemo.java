package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Select s=new Select(driver.findElement(By.id("speed")));
		Thread.sleep(3000);
		
		s.selectByIndex(2);
		//s.selectByVisibleText("Fast");
		Thread.sleep(3000);
		driver.close();

		
	}

}
