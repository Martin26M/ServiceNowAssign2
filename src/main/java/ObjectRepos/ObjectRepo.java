package ObjectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepo  {

	@FindBy(xpath="//a[@class='wp-block-button__link']") protected  static  WebElement shopnowbutton;
	@FindBy (id="woocommerce-product-search-field-0") protected static WebElement searchfield;
	@FindBy (xpath="//button[@value='Search']") protected static WebElement searchbtn;
	@FindBy (xpath="//header[@class='woocommerce-products-header']/h1")protected static  WebElement storetitle;
	@FindBy(xpath="//button[@name='add-to-cart']")  protected static WebElement clickaddtoCartbutton;
	@FindBy(xpath="//div[@class='woocommerce-message']/a")protected static  WebElement viewcartbutton;
	@FindBy(xpath="//li[@id='menu-item-1264']/a") protected static WebElement Womenlink;
	@FindBy(xpath="//input[@class='_3704LK']") protected static WebElement searchbox;
	@FindBy(xpath="//button[@class='L0Z3Pu']") protected static WebElement clickonSearch;
	@FindBy(xpath="//div[@data-id='TVSFVWD2GRQEG462']/div/a/div[2]/div[1]/div[1]") protected static WebElement FistProd;

	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']") protected static WebElement AddButton;
	@FindBy(xpath="//div[@class='_I_XQO'][1]/div[5]/div/span/div/div/span") protected static WebElement totalAmount;
	
	
}
