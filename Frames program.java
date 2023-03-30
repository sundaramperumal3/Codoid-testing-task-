package Paratices_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leto_iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement firstFr=driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(firstFr);
		driver.findElement(By.name("fname")).sendKeys("sundaram");
		driver.findElement(By.name("lname")).sendKeys("c");
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("emails");
		//driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		//driver.findElement(By.name("lname")).sendKeys("kolathur");
		driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a")).click();
		
	}

}
