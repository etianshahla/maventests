import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver" ,  "/Users/etian/Downloads/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.quit();
  }
}
