package scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver", "./software/chromedriver.driver");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("1234");
         

	}

}
