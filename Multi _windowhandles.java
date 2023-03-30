package Paratices_selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String windohandle=driver.getWindowHandle();
		System.out.println(windohandle+"firstwindow");
		driver.findElement(By.id("home")).click();
		Set<String>	windohandles=driver.getWindowHandles();
		System.out.println("childwindow"+windohandles);
		List<String> list=new ArrayList<String>(windohandles);
		//child window
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		//parent window
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String>windohandles1=driver.getWindowHandles();
		List<String>list1=new ArrayList<String>(windohandles1);
		list.clear();
		list.addAll(windohandles1);
		driver.switchTo().window(list.get(0));
		String currenturl=driver.getCurrentUrl();
		System.out.println("parent"+currenturl);
		driver.quit();	
		}
}
