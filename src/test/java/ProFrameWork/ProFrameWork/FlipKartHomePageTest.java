package ProFrameWork.ProFrameWork;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.TestUtil;




public class FlipKartHomePageTest extends BaseTest {

	@Test

	public void flipkartHomecheck() throws InterruptedException, IOException {

		FlipkartHomePage pg = new FlipkartHomePage(driver);

		pg.closePopup();
		pg.FindSplitAC();
       String s =  pg.getItem();
       String s2 =TestUtil.getData("WorkBook 2", "Sheet1", 1, 1);
        
	   pg.getProductList();
	}

}
