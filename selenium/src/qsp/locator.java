package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("key","value");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.tagname("a1"));
		ele.click();
		
		

	}

}
