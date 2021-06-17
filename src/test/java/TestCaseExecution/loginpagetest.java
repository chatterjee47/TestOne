package TestCaseExecution;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import BaseClass.browsersetup;
import PageObjectory.loginpage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginpagetest extends browsersetup {

	loginpage lp;
	String filepath = System.getProperty("user.dir") + "\\config\\file.properties";
	Properties prop;
	FileInputStream file;

	@Given("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		file = new FileInputStream(filepath);
		prop = new Properties();
		prop.load(file);
		System.out.println("Open browser");
		driver = browsersetup.setup(prop.getProperty("browsername"), prop.getProperty("url"));
	}

	@Then("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable usercredentials) throws Throwable {
		// 1st way
		List<String> value = usercredentials.asList(String.class);
		lp = new loginpage(driver);
		Thread.sleep(1000);
		lp.username(value.get(0));
		lp.password(value.get(1));

		// 2nd way
		List<List<String>> data = usercredentials.raw();
		lp = new loginpage(driver);
		Thread.sleep(1000);
		// This is to get the first data of the set (First Row + First Column)
		lp.username(data.get(0).get(0));

		// This is to get the first data of the set (First Row + Second Column)
		lp.password(data.get(0).get(1));

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		Thread.sleep(1000);
		lp.btnLogin();
	}

	@Then("^Verify title of the page$")
	public void verify_title_of_the_page() throws Throwable {
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		driver.close();
	}

}