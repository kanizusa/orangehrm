package com.orangeloginlogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangepagefactory.orangeloginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrangeSteps {
	WebDriver driver;
	orangeloginpage orangeloginpage;

	@Given("^user go to open browser and browse to log in section$")
	public void user_go_to_open_browser_and_browse_to_log_in_section() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		orangeloginpage = PageFactory.initElements(driver, orangeloginpage.class);

	}

	@Then("^user go to page and verify title \"([^\"]*)\"$")
	public void user_go_to_page_and_verify_title(String arg1) throws Throwable {
		driver.getTitle();

	}

	@Then("^user enter valid username and valid password$")
	public void user_enter_valid_username_and_valid_password() throws Throwable {
		
		orangeloginpage.getUsername().sendKeys("Admin");
		orangeloginpage.getPassword().sendKeys("admin123");

	}

	@Then("^user press Login button$")
	public void user_press_Login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

		
		
		//WebElement login= driver.findElement(By.xpath("//*contains(text(), Welcome')]"));
	}

	@Then("^user navigate on human icon button next to arrow$")
	public void user_navigate_on_human_icon_button_next_to_arrow() throws Throwable {
		driver.findElement(By.xpath("//*[@id='welcome']")).click();

		
	}

	@Then("^user click log out button$")
	public void user_click_log_out_button() throws Throwable {
		WebDriverWait wait =new WebDriverWait(driver,10);
		
		WebElement welcome = driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]")); 
		WebElement logout = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")); 
		welcome.click();
		
		
		
		wait.until(ExpectedConditions.visibilityOf(logout)).click();

		
		
		
	}

}
