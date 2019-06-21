package StepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C://Users//vimal//Desktop//Temp//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("^title is Rediffmail$")
	public void title_is_Rediffmail() {
		String title = driver.getTitle();
		Assert.assertEquals("Rediffmail", title);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable cred) throws Exception {

		for (Map<String, String> map : cred.asMaps(String.class, String.class)) {

			driver.findElement(By.id("login1")).sendKeys(map.get("username"));
			driver.findElement(By.id("password")).sendKeys(map.get("password"));
			driver.findElement(By.name("proceed")).click();
		}
	}

	/*@Then("^user click on go button$")
	public void user_click_on_go_button() {
		driver.findElement(By.name("proceed")).click();
	}*/

	@Then("^close the browser$")
	public void close_the_broweser() {
		driver.close();
	}

}
