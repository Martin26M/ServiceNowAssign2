package ProFrameWork.ProFrameWork;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.TestUtil;


public class AddtoCartPageTest extends BaseTest {

	AddtoCartPage atc;
	FlipkartHomePage hm;

	@Test
	public void searchforitem() throws InterruptedException, IOException {
		hm = new FlipkartHomePage(driver);
		atc = new AddtoCartPage(driver);

		hm.closePopup();
		atc.sendsearchText();
		Assert.assertTrue(atc.AssertProddetails());
		atc.switchToChildWindow();
		atc.addToCart();
		System.out.println(TestUtil.getData("WorkBook 2", "Sheet1", 1, 1));
		Assert.assertEquals(atc.getTotalAmount(), TestUtil.getData("WorkBook 2", "Sheet1", 1, 1));
		

	}

}
