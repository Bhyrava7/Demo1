package scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(	JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4800)");
		WebElement ele=driver.findElement(By.xpath(//input[@id='search']));
				Point point=ele.getLocation();
		int ycord=point.getY();
		System.out.println("position of the webelement: "+ycord);
		ele.click();
		Thread.sleep(2000);
		driver.close();
	}
}
		


	}

}
