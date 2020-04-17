package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepd {
	WebDriver driver;
	@Given("user enters chrome browser")
	public void user_enters_chrome_browser() {
		System.setProperty("webdriver.Chrome.driver","C:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
	}

	@When("user enters login pagin")
	public void user_enters_login_pagin() {
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}
	

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    driver.findElement(By.name("Login")).click();
	}

	@When("user searches for headphones")
	public void user_searches_for_headphones() {
		driver.findElement(By.name("products")).sendKeys("Headphone");
 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("user adds headphone to cart")
	public void user_adds_headphone_to_cart() {
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	   
	   
	   driver.close();	}

	
}
