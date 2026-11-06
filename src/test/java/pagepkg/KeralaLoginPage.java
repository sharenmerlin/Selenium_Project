package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeralaLoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"ulogin\"]" )WebElement Username;
	@FindBy(xpath = "//*[@id=\"upass\"]")WebElement Password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement LoginBtn;
	
	public KeralaLoginPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public  String titlemethod()
	{
		String title = driver.getTitle();
		return title;
	}

	public void loginmethod (String un, String pwd)
	{
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		LoginBtn.click();
		
		
		
	}

}
