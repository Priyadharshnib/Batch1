package ObjPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class homepage extends Basepage{
	
	@FindBy (xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Womentag;
	
	@FindBy (xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dressestag;
	
	@FindBy (xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirtstag;
	
	@FindBy (id="newsletter-input")
	private WebElement Newsletter;
	
	@FindBy (name="submitNewsletter")
	private WebElement ClickNewsletter;
	
	@FindBy(xpath="//*[@id=\"columns\"]/p")
	private WebElement Message;
	
	@FindBy (id="search_query_top")
	private WebElement SearchBox;
	
	@FindBy (xpath="//*[@id=\"searchbox\"]/button")
	private WebElement ClickBtn;
	
	@FindBys(@FindBy(xpath ="//ul[@class='product_list grid row']/li"))
    private List<WebElement> SearchResult;
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomenTag() {
		return Womentag;
	}

	public WebElement getDressestag() {
		return Dressestag;
	}
		
		public WebElement getTshirtstag() {
			return Tshirtstag;
			
		}
		public void ClickWomen() {
			Womentag.click();
		}
		public void ClickDresses() {
			Dressestag.click();
		}
		public void ClickTshirts() {
			Tshirtstag.click();
		}
		
		public WebElement getNewsletter() {
			return Newsletter;
			
		}
		public WebElement getClickNewsletter() {
			return ClickNewsletter;
			
		}
		
	public String getMessage() {
		return Message.getText();
		
	}
	public WebElement getSearchBox() {
		return SearchBox;
	}
		public WebElement getClickBtn() {
			return ClickBtn;
		}
	public int getSearchResult() {
		return SearchResult.size();
	}
	}

