package Paratices_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_letcode {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement alert=driver.findElement(By.id("accept"));
		alert.click();
		Alert alert1=driver.switchTo().alert();
		//String text =alert.getText();
		//System.out.println(text);
		alert1.accept();
		Thread.sleep(2000);
		//comfirm
		WebElement confirmbox=driver.findElement(By.id("confirm"));
		confirmbox.click();
		Alert confirmbox1=driver.switchTo().alert();
		String confirmtext=confirmbox1.getText();
		System.out.println(confirmtext);
		confirmbox1.dismiss();
		Thread.sleep(2000);
		//prompt
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert();
		String text1=alert.getText();
		System.out.println(text1+"prompt");
		alert1.accept();
		//Thread.sleep(2000);
		driver.close();

	}

}
