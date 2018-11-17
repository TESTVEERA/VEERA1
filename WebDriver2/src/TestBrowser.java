//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe" );
		//ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.webdriver.ie.driver" "C:\\softwares\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
		//InternetExplorerDriver driver = new InternetExplorerDriver();

		  driver.get("https://google.com/");
		  //File from local to remote-veera
		
	}

}
