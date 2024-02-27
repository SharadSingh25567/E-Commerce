package frame.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract.AbstractParent;

public class ProdCatalogue extends AbstractParent {
	WebDriver driver;
    
	public ProdCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".mb-3")
	List<WebElement> prod;
	By products = By.cssSelector(".mb-3");
	By addtocart=By.cssSelector(".card-body button:last-of-type");
    By name=By.id("toast-container");
	public List<WebElement> getProdsList() {
		waitTobeAppear(products);
		return prod;

	}
	
	public WebElement getproductname(String productname )
	{
		WebElement prod=getProdsList().stream().filter(l->l.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		return prod;
}
	public void addproduct(String productname)
	{
		WebElement prod=getproductname(productname);
		prod.findElement(addtocart).click();
		waitTobeAppear(name);
		waitTobeDisappear(name);
}
}
