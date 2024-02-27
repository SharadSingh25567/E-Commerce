package Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractParent {

	WebDriver driver;
	String a;

	public AbstractParent(WebDriver driver) {
		// super(driver);
		this.driver = driver;

	}

	public void waitTobeAppear(By find) {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(find));

	}
	public void waitTobeDisappear(By finds) {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
	
}
}
