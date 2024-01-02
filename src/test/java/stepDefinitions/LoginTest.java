package stepDefinitions;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
	    WebDriverManager.firefoxdriver().setup();
	    System.setProperty("webdriver.chrome.driver", "V:\\New Chrome Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@Given("I want to load the URL")
	public void i_want_to_load_the_url() {
	    
		driver.get("http://localhost:8888");
		
	}
	@When("Login Page is Displayed enter Username and Password")
	public void login_page_is_displayed_enter_username_and_password() {
	    
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
	}
	@When("Click on Login")
	public void click_on_login() {
		driver.findElement(By.id("submitButton")).click();
	}
	@Then("Validate for Home Page title")
	public void validate_for_home_page_title() {
	    String expTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	    System.out.println("Expected Title="+expTitle);
		String actTitle = driver.getTitle();
		System.out.println("Actual Title="+actTitle);
		assertEquals(actTitle, expTitle);
		
	}

}
