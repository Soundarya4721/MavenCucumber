package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestStepDefintion {
	WebDriver driver;
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By logon=By.xpath("//input[@value='Login']");

	@Given("^\"(.*)\" is opened$")
	public void url_is_opened(String Url) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","/Users/ltatavarthy/Documents/chromedriver/chromedriver");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(Url);
	}

	@When("^CRM Screen opens$")
	public void crm_Screen_opens() throws Throwable {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
      System.out.println(driver.getCurrentUrl());
	}
	
	@Then("^Enter \"(.*)\" and \"(.*)\"$")
	public void enter_username_and_password(String uname,String pwrd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwrd);	
	}

	@Then("^Hit on the logon$")
	public void hit_on_the_logon() {
		driver.findElement(logon).click();
	}
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page()  {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Then("^user types \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contact_details(String Firstname,String lastname,String position)  {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
	

}
