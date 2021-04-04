package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountStepDef {

	WebDriver driver;
	@SuppressWarnings("deprecation")
	WebDriverWait wait=new WebDriverWait(driver,80);
	@Given("^User is on login page \"([^\"]*)\"$")
	public void user_is_on_login_page(String Url) throws Throwable {
		 WebDriverManager.chromedriver().setup(); 
		  driver=new ChromeDriver();
		  driver.get(Url);
		  driver.manage().window().maximize(); 
		  driver.manage().deleteAllCookies();
		  WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("cypress@testleaf.com");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("Bootcamp@123");
			WebElement loginButton = driver.findElement(By.id("Login"));
			loginButton.click();
			}
	
	
	@When("^User click on toggle menu button from left corner$")
	public void user_click_on_toggle_menu_button_from_left_corner() throws Throwable {
		WebElement toggleMenuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("slds-icon-waffle")));
		toggleMenuButton.click();
		System.out.println("toggle menu clicked");
	}

	@When("^Click view All and click Sales from App Launcher$")
	public void click_view_All_and_click_Sales_from_App_Launcher() throws Throwable {
		WebElement viewAllButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
		viewAllButton.click();			 
		WebElement salesOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Sales']")));
		salesOption.click();
		System.out.println("Sales from App Launcher is clicked successfully");
	}

	@When("^Click on Accounts tab$")
	public void click_on_Accounts_tab() throws Throwable {
	  
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Accounts']"))).click();
	}

	@When("^Click on New button$")
	public void click_on_New_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='New']"))).click();
	}

	@When("^Enter \"([^\"]*)\" as account name$")
	public void enter_as_account_name(String name) throws Throwable {
	   
		WebElement AccountName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='Name']")));
		AccountName.click();
		AccountName.sendKeys(name);
		
	}

	@When("^Select Ownership as Public$")
	public void select_Ownership_as_Public() throws Throwable {
	  
	}

	@When("^Click save$")
	public void click_save() throws Throwable {
	   
	}

	@Then("^verify Account name created$")
	public void verify_Account_name_created() throws Throwable {
	  
	}


}
