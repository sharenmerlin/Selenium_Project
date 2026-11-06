package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KeralaHomePage {
	
	WebDriver driver;
	
    @FindBy(linkText = "Add Property")WebElement addproperty;	
    @FindBy ( xpath = "//*[@id=\"proptype\"]")WebElement propertyfor;
	@FindBy ( xpath ="//*[@id=\"listtype\"]" )WebElement listplan;
	@FindBy ( xpath = "//*[@id=\"proplabel\"]")WebElement propertylabel;
	@FindBy ( xpath = "//*[@id=\"propcategory\"]")WebElement category;
	@FindBy ( xpath ="//*[@id=\"propcost\"]" )WebElement expectedprice;
	@FindBy ( xpath = "//*[@id=\"propbeds\"]")WebElement bed;
	@FindBy ( xpath = "//*[@id=\"propbaths\"]")WebElement bath;
	@FindBy ( xpath = "//*[@id=\"district\"]")WebElement district;
	@FindBy(id = "proplocation")WebElement location;
	@FindBy ( xpath = "//*[@id=\"propaddress\"]")WebElement address;
	@FindBy ( xpath = "//*[@id=\"introlabel\"]")WebElement addtitle;
	@FindBy ( xpath = "//*[@id=\"frm_property\"]/div[9]/div/div/iframe")WebElement frametag;
	@FindBy ( xpath = "/html/body")WebElement summarybox;
	
	public KeralaHomePage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	
	public void addproperty_mthd ()
	{
		addproperty.click();
	}
	
	public void details_method()
	{
		Select property = new Select(propertyfor);
		property.selectByVisibleText("Rental");
		
		Select list = new Select(listplan);
		list.selectByVisibleText("Featured Listing");
		
		propertylabel.sendKeys("abcd");
		
		Select categ = new Select(category);
		categ.selectByVisibleText("Residential Land");
		
		expectedprice.sendKeys("50000");
		bed.sendKeys("4");
		bath.sendKeys("4");
		
		Select dist = new Select(district);
		dist.selectByVisibleText("Ernakulam");
		
		Select loctn = new Select(location);
		loctn.selectByVisibleText("Aluva");
		
		address.sendKeys("xyz");
		addtitle.sendKeys("House for Sale");	
		
	}
	
	public void iframe_method()
	{
		driver.switchTo().frame(frametag);
		
		summarybox.click();
		summarybox.sendKeys("Property Details");
		
		driver.switchTo().defaultContent();
	}
}
