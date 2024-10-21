package stepDefinition;

import java.util.List; 
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbDataImplemetation { 
	
	@Given("user sending the datas at step level for fb page")
	public void user_sending_the_datas_at_step_level_for_fb_page(DataTable dataTable) throws InterruptedException {
	   List<String> asList = dataTable.asList();
	   
	   for(String s : asList) {
		   
		   System.out.println(s);
	   }
	   
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   WebElement uname = driver.findElement(By.id("email"));
	   
  for(String s : asList) {
		   
		   uname.sendKeys(s);
		   Thread.sleep(3000);
		   
		   
		   uname.clear();
	   }
	   
	   
	   
	}
	
	
	@Given("user passing datas at step level")
	public void user_passing_datas_at_step_level(DataTable dataTable) {
	    
		List<List<String>> asLists = dataTable.asLists();
		
		for(List<String>  l :asLists) {
			
			
			for(String s: l) {
				System.out.println(s);
			}
			
		}
	}
	
	@Given("user sending the data with header")
	public void user_sending_the_data_with_header(io.cucumber.datatable.DataTable dataTable) {
	   Map<String, String> asMap = dataTable.asMap();
	   
	   for(Entry<String, String> e:asMap.entrySet()) {
		   
		   System.out.println(e.getKey());
		   System.out.println(e.getValue());
		   
	   }
	}

	
	@Given("user sending datas with header")
	public void user_sending_datas_with_header(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> asMaps = dataTable.asMaps();
	   
	   for(Map<String, String> m:asMaps) {
		   Set<Entry<String, String>> entrySet = m.entrySet();
		   
		   for(Entry<String, String> e:entrySet) {
			   
			   System.out.println(e.getKey());
			   System.out.println(e.getValue());
			   
		   }
	   }
	   
	   
	}




}
