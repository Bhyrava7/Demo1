import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class oprnie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","./software.IEdriver.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://in.tradingview.com/");
			driver.close();
			
		

	}ask rohitbro

}
