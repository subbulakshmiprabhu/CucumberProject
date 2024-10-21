package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin { 
	
	WebDriver driver ;
	@Before("@sanity")
	public void before() {
		System.out.println("before");
	}
	@Before("@smoke'")
	public void nextbefore() {
		System.out.println("next before");
	} 
	
	@BeforeStep
	public void beforestep() {
		System.out.println("before step");
	}
	
	
	@AfterStep
	public void afterStep() {
		
		System.out.println("after step");
		
	}
	
	@Given("User launches the fb url")
	public void user_launches_the_fb_url() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		
	   driver.findElement(By.id("email")).sendKeys("cucumber");
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		
		driver.findElement(By.id("pass")).sendKeys("123");
	    
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		
		
		driver.close();
	    
	}
	
	
	@After(order = 2)
	
	public void after() {
		
		System.out.println("after");
		
	}
	

	@After(order =1)
	
	public void lastafter() {
		
		System.out.println("last after");
		
	}
	

}
