package qsp.in;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.beust.jcommander.Parameter;

public class parallelexe {
	public WebDriver driver;
	@Parameters({"browsers"})
	@test
	public void test1(String browser)
	{
		System.setProperty("webriver.chrome.driver","./software/chromedriver.exe");
		
		System.setProperty("browser.equals","./software/geckodriver.exe");
if(browser.equals("chrome"))
{
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
}
else {
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
}
	}
	

}
