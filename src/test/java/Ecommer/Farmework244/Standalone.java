package Ecommer.Farmework244;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Standalone{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("SnghSha@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Singh@1234");
		driver.findElement(By.id("login")).click();
		//List<WebElement> li=driver.findElements(By.cssSelector(".mb-3"));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> li=driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod=li.stream().filter(l->l.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		WebDriverWait wi=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
		driver.findElement(By.xpath("//button[@routerlink=\"/dashboard/cart\"]")).click();
		//driver.findElement(By.xpath("//button[@routerlink=\"/dashboard/\"]")).click();
		List <WebElement> lists=driver.findElements(By.cssSelector(".cartSection h3"));
		//Boolean match=lists.stream().anyMatch(o->o.getText().equalsIgnoreCase("ADIDAS ORIGINAL"));
		//Assert.assertTrue(match);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".totalRow button")));
		driver.findElement(By.cssSelector(".totalRow button")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Select Country\"]")).sendKeys("Ind");
		
		  w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		 driver.findElement(By.xpath("//section/button[2]")).click();
		  
		driver.findElement(By.cssSelector(".field.small input:nth-child(2)")).sendKeys("1234");
		driver.findElement(By.cssSelector(".field input:nth-child(2)")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name=\"coupon\"]")).sendKeys("Coupan");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".action__submit")));
		driver.findElement(By.cssSelector(".action__submit")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h1.hero-primary")));
		WebElement match=driver.findElement(By.cssSelector("h1.hero-primary"));
		{
			if (match.getText().equalsIgnoreCase("THANKYOU FOR THE ORDER."))
			{
				System.out.println("Shiii jaa rhee ho guru");
				match.getText();
			}
			else
			{
				System.out.println("Code galat h");
			}
		}
		
}
	
}