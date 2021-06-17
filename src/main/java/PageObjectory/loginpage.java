package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.browsersetup;

public class loginpage extends browsersetup{
	
	
	public loginpage(WebDriver driver){
		browsersetup.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	public void username(String strusername){
		username.sendKeys(strusername);
	}
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	public void password(String strpassword){
		password.sendKeys(strpassword);
	}
	
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	public void btnLogin(){
		btnLogin.click();
	}

}
