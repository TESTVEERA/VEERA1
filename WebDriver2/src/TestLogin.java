import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
	String title = driver.getTitle();
				
	System.out.println(	title );
       System.out.println(title.length());
      //File from wqewqew24444
     //File from wqewqew244440000
     //File from wqewqew2444400
	}

}
