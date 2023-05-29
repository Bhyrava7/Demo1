package implicitly;

import org.openqa.selenium.chrome.ChromeDriver;

public class open1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.tradingview.com/");
		driver.close();


	}
	
	
}
