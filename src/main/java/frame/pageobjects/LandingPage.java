package frame.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
}
	@FindBy(id="userEmail")
	WebElement userEmail;
	@FindBy (id="userPassword")
	WebElement passworde;
	@FindBy(id="login")
	WebElement submit;
	
	public void loginApplication(String UserEmail,String password)
	{
	userEmail.sendKeys("SnghSha@gmail.com");
	passworde.sendKeys("Singh@1234");
	submit.click();
}
	public void go()
	{
		driver.get("https://rahulshettyacademy.com/client");
		
}
}
	