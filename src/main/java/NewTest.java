import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class NewTest {
public WebDriver driver; 
	@Test
  public void SignUp() {
		/*
		 * driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
		 * driver.findElement(By.id("user_email_login")).sendKeys(
		 * "sadhvisingh9049+1@gmail.com");
		 * driver.findElement(By.id("user_password")).sendKeys("BrowserStack123*");
		 * driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click()
		 * ; driver.findElement(By.id("user_submit")).click();
		 */
  }
  @BeforeMethod
  public void beforeMethod() {
		/*
		 * driver.get("https://www.browserstack.com/");
		 * driver.findElement(By.id("signupModalButton")).click();
		 * System.out.println("We are currently on the following URL"
		 * +driver.getCurrentUrl());
		 */
  }

  @AfterMethod
  public void afterMethod() {
	  //System.out.println(driver.getCurrentUrl());
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.browserstack.com/users/sign_up");
	  driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
		driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh9049+1@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("BrowserStack123*");
		driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
		driver.findElement(By.id("user_submit")).click();
	  

  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }
  

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
