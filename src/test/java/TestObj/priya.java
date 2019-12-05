package TestObj;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjPage.Basepage;
import ObjPage.homepage;

public class homepageTest {
	
	
		homepage hp;
		Basepage bp1;
			
	public homepageTest() {
		hp= new homepage();
		bp=new Basepage();
	}
	
	@Test
	public void verifytab() {
		Assert.assertTrue(bp.elementFound(hp.getWomenTag()), "Failed to display");
		Assert.assertTrue(bp.elementFound(hp.getDressestag()), "Fail");
		Assert.assertTrue(hp.elementFound(hp.getTshirtstag()), "Fail");
	}
	

	
	@Test()
	public void verifynavigation() {
		
		hp.ClickWomen();
                hp.ClickWomen();
		String title=hp.getTitlte();
		Assert.assertTrue(title.contains("Women"), "Failed to getWomenTag");
	
		hp.ClickDresses();
		String title1= hp.getTitlte(); //can give same title name as above since its local variable
		Assert.assertTrue(title1.contains("Dresses"), "Failed");
	
	    hp.ClickTshirts();
		String title2= hp.getTitlte();
		Assert.assertTrue(title2.contains("T-shirts"), "Fail");
	
	}

		@Test
		public void verifyMessage() {
			hp.getNewsletter().sendKeys("devanand.proff@gmail.com");
			hp.getClickNewsletter().click();
			Assert.assertTrue(hp.getMessage().contains("registered"), "Fail");
			
		}
		
	//	@BeforeMethod
	//	public void beforeMethod() {
		//	hp.ClickDresses(); 
	//	}
		
		@AfterClass
		public void afterclass() {
			bp.quitDriver();
		}
		@Test
		public void verifySearchResult() {
			hp.getSearchBox().sendKeys("casual");
			hp.getClickBtn().click();
			Assert.assertTrue(hp.getSearchResult()>0, "Fail");
		}
	
}
