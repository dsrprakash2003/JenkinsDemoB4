package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GoogleTest {
	WebDriver driver;
	
	@Test
	  public void LaunchTest() {
	      String Expected="Google";
	      String Actual=driver.getTitle();
	      Assert.assertEquals(Expected, Actual);
	      
	  }
	  @BeforeTest
	  public void LaunchAppTest() {
	      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	      driver= new ChromeDriver();
	      driver.get("http://www.google.com");
	      
	  }
	  @AfterTest
	  public void BrowserCloseTest() {
	  
	      driver.quit();
	  }
}
