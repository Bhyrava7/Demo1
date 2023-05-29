package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Form");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("Lokesh");
		driver.findElement(By.id("Last name")).sendKeys("Bhyrava");
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@name='optradio']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        

		
		
		

	}

}
