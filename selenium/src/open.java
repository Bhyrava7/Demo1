import org.openqa.selenium.chrome.ChromeDriver;

public class open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.tradingview.com/");
		driver.quit();

	}

}
