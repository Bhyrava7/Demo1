package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement( By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	}

}
