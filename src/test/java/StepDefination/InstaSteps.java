package StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstaSteps {
	
	WebDriver driver;
	
	@Given("Open browser, enter Instagram url.")
	public void open_browser_enter_instagram_url() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		
	}

	@When("user enters Mobile No. , Fulname , Username , Password")
	public void user_enters_mobile_no_fulname_username_password() {

		   driver.findElement(By.cssSelector("[name='emailOrPhone']")).sendKeys("9926912345");
		   driver.findElement(By.cssSelector("[name='fullName']")).sendKeys("Herry Gurjar");
		   driver.findElement(By.cssSelector("[name='username']")).sendKeys("he_rry350");
		   driver.findElement(By.cssSelector("[name='password']")).sendKeys("Herrygurjar@123");	
	
		
	}

	@When("user clicks the signup button")
	public void user_clicks_the_signup_button() {

		driver.findElement(By.cssSelector("[type='submit']")).click();   

		
	}

	@Then("Successful sign up message should be displayed")
	public void successful_sign_up_message_should_be_displayed() {

		String gotu  = driver.findElement(By.xpath("//span[text()='Add Your Birthday']")).getText();  
		String msg = "Add Your Birthday";
		Assert.assertEquals(msg, gotu);

		
	}

}
