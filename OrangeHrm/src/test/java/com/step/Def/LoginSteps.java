package com.step.Def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangepagefactory.orangeloginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	 
	orangeloginpage orangeloginpage; 

	@Given("^user open web browser and navigate to HRM login screen$")
	public void user_open_web_browser_and_navigate_to_HRM_login_screen() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/"); 
	driver.manage().window().maximize();
	//orangeloginpage=orangeloginpage.initElements (driver,orangeloginpage.class);
	
		
	   
	}

	@Then("^user Navigate to Page and verify the Page Title is \"([^\"]*)\"$")
	public void user_Navigate_to_Page_and_verify_the_Page_Title_is(String arg1) throws Throwable {
		driver.getTitle();
	   
	}

	@Then("^user enter a valid username and password$")
	public void user_enter_a_valid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
   
		orangeloginpage.getUsername().sendKeys("Admin");
		orangeloginpage.getPassword().sendKeys("admin123");
		
		
	}

	@Then("^user click the Sign in button$")
	public void user_click_the_Sign_in_button() throws Throwable {
	    
	driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();  
	}

	@When("^user click on log out button for Orange Hrm$")
	public void user_click_on_log_out_button_for_Orange_Hrm() throws Throwable {
		
		WebElement obj =driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
		obj.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	  
	}


}
