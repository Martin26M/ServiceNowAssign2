package ProFrameWork.ProFrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartHomePage extends BasePage {

	public FlipkartHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void closePopup() {

		WebElement popup =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	
		try {
			if (popup.isDisplayed()) {
				
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			}
			
		}
		catch(Exception e ) {
			
			e.printStackTrace();
			
			
		}
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Appliances']"))));


	}

	public void FindSplitAC() {
		
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Appliances']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a[3]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@class='_3XS_gI']/a[3]"))).click().build().perform();

	}
	public String getItem() throws InterruptedException {

		Thread.sleep(2000);

		String s = driver.findElement(By.xpath("//div[text()='SAMSUNG 1.5 Ton 5 Star Split Inverter AC  - White']")).getText();

		
		
		return s;
	}
	
	public String getitemPrice() {
		
		
		String ss = driver.findElement(By.xpath("//div[@data-id='ACNGFVMJ5ZKZVFDS']/div/a/div[2]/div[2]/div[1]")).getText();
	
		return ss;
	}
	
	
	
	public void getProductList() {
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_3pLy-c row']/div[1]/div[1]"));
		List<WebElement> list1= driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	
     for (int i =0; i<list.size(); i++) {
    	 
    	 
    	 
    	 System.out.println(list.get(i).getText()+"---->>>"+list1.get(i).getText());
    	 
     }
	

	}
		
	
	}



