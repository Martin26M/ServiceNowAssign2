package ProFrameWork.ProFrameWork;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class AddtoCartPage extends BasePage {

	public AddtoCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void sendsearchText() throws InterruptedException {

		searchbox.sendKeys("One Plus");
		clickonSearch.click();
		Thread.sleep(1000);
		FistProd.click();
		
	}

	public boolean AssertProddetails() {

		String s = FistProd.getText();
		if (s.contains("OnePlus Y Series 108 cm")) {

			return true;

		} else {

			return false;
		}

	}

	public void switchToChildWindow() {

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String Parent = it.next();
		String Child = it.next();
		driver.switchTo().window(Child);

	}

	public void addToCart() {
		
		
		AddButton.click();
	}
	
	public String getTotalAmount() throws InterruptedException {
	
	Thread.sleep(2000);
		
	String amount= 	totalAmount.getText().toString();
	amount =amount.replaceAll("[^0-9]", "");
	
	return amount;
	
	}
}
