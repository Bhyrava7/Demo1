package myntraaddtocart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {


		public static void main(String[] args) throws AWTException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("ReebokShoes");
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//img[@draggable='false']")).click();
			

			
		}
	}

