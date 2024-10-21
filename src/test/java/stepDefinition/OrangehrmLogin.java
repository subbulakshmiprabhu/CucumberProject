package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangehrmLogin {
	  
	WebDriver driver;
	
	@Given("user launches the orangehrm url")
	public void user_launches_the_orangehrm_url() {
		WebDriverManager.chromedriver().setup();  
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}

	@When("user enters username")
	public void user_enters_username() {
		driver.findElement(By.name("username")).sendKeys("Admin");
	  
	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	   
	}
	@When("user clicks on orangelogin button")
	public void user_clicks_on_orangelogin_button() {
	   driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}


	@Then("user should logged in successfully")
	public void user_should_logged_in_successfully() {
		//boolean displayed = driver.findElement(By.xpath("//h6[text() = 'Dashboard']")).isDisplayed();
		//System.out.println(displayed);
		driver.close();
	    
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String uname) {
		driver.findElement(By.name("username")).sendKeys(uname);
		
	   	}
	@When("user enters the password {string}")
	public void user_enters_the_password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}




}
