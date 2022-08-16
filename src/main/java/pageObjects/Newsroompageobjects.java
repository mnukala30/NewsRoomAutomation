package pageObjects;
import java.util.List;
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class Newsroompageobjects {
	
	public Newsroompageobjects(WebDriver driver)

	 {
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//*[text()='Latest News']")
	public WebElement latestNewsHeading;

	@FindBys(@FindBy(xpath="//h2[contains(text(),'Latest News')]//following-sibling::ul//following-sibling::li"))
	public List<WebElement> articlesunderLatestnews;
	
	@FindBy(xpath="//h2[contains(text(),'More from Newsroom')]")
	public WebElement moreFromNewsroom;

	@FindBys(@FindBy(xpath="//h2[contains(text(),'More from Newsroom')]//following-sibling::ul//following-sibling::li"))
	public List<WebElement> articlesundermoreFromNewsroom;
	
	@FindBy(xpath="//div[@class='image event-branding-img']")
	public WebElement eventBrandingimage;
	
	@FindBy(xpath="//div[@class='ac-ln-content']")
	public WebElement localNovDisplay;
	
	@FindBy(xpath="//div[@class='event-info-heading']")
	public WebElement takeOverHeader;
	
	@FindBy(xpath="//a[contains(text(),'Watch event')]")
	public WebElement watchEventCTA;
	
	@FindBys(@FindBy(xpath="//div[@class='event-info post-event']//following-sibling::ul//following-sibling::li"))
	public List<WebElement> articlesUnderTakeOverSection;
	
	@FindBy(xpath="//section[@class='takeover theme-dark']//following-sibling::section[1]")
	public WebElement takeOverFollowedLatestNews;
	
	@FindBys(@FindBy(xpath="//*[@class='tile-item item-portrait' and @class='tile-item item-hero-reversed' and @class='tile-item item-hero-secondary']  "))
	public List<WebElement> oneUpArticles;
	
	@FindBys(@FindBy(xpath="//*[@class='tile-item item-2up' and @class='tile-item item-2up-secondary']"))
	public List<WebElement> twoUpArticles;
	
	@FindBys(@FindBy(xpath="//*[@class='tile-item item-3up-secondary']"))
	public List<WebElement> threeUpArticles;
	
	@FindBy(xpath="//div[@class='ac-ln-menu']")
	public WebElement searchNewsroomPopularTopics;
	
	@FindBy(xpath="//li[@class='ac-ln-menu-item'][1]//following-sibling::li[1]")
	public WebElement popularTopicsbesideSearchNewsroom;
	
	@FindBy(xpath="//a[contains(text(),'Newsroom')]//parent::span//following-sibling::div")
	public WebElement newsroombesideSearchNewsroom;
	
	@FindBy(xpath="//span[@class='ac-ln-title']//a")
	public WebElement newsroomHyperlink;
	
	@FindBy(xpath="//button[@class='btn-topics ac-ln-menu-link']")
	public WebElement popularTopics;
	
	@FindBy(xpath="//div[@class='topic-group'][3]//following-sibling::div[4]//child::a")
	public WebElement mac_popularTopics;
	
	@FindBy(xpath="//button[@class='nr-sf-link']")
	public WebElement searchNewsroom;
	
	@FindBy(xpath="//input[@class='nr-sf-input']")
	public WebElement EnterText;
	
	@FindBy(xpath="//a[@class='nr-cta-primary-light']")
	public WebElement viewArchive;
	
	@FindBy(xpath="//div[@class='section-content'][1]")
	public WebElement Mac_related_articals;
	
	@FindBy(xpath="//div[@class='results']")
	public WebElement Macbook_related_articals;
	
	//Locators new
	
	@FindBy(xpath="//button[contains(text(),'Search Newsroom’)]")
	public WebElement searchNewsRoom;
	
	@FindBy(xpath="//button[contains(text(),'Popular Topics')]")
	public WebElement popularTopic;
	
	
		
public boolean latestNewsHeadingIsDisplayed() {
		boolean result=false;
		if(latestNewsHeading.isDisplayed()) {
		result=true;
	}
		return result;
		
	}
	
public boolean moreFromNewsroomsIsDisplayed() {
		boolean result=false;
		if(moreFromNewsroom.isDisplayed()) {
			result=true;
		}
		return result;
		
	}
	public int getArticlesCountUnderLatestNews() {
		return articlesunderLatestnews.size();
	}
	public int getArticlesCountUnderMoreFromNewsroom() {
		return articlesundermoreFromNewsroom.size();
	}
	
	public boolean eventBrandingimageIsDisplayed() {
		boolean result=false;
		if(eventBrandingimage.isDisplayed()) {
			result=true;
		}
		return result;
		
	}
	
	public boolean localNovDisplayIsDisplayed() {
		boolean result=false;
		if(localNovDisplay.isDisplayed()) {
			result=true;
		}
		return result;
	}
		
	public boolean takeOverHeaderIsDisplayed() {
			boolean result=false;
			if(takeOverHeader.isDisplayed()) {
				result=true;
			}
			return result;
		}
			
	public boolean watchEventCTAIsDisplayed() {
			boolean result=false;
			if(watchEventCTA.isDisplayed()) {
					result=true;
				}
				return result;
	}
	 public boolean watchEventCTAClick()
	 {
		 
					
		 boolean result=false;
			if(watchEventCTA.isEnabled()) {
					result=true;
				}
				return result;
			
			
	 }

	 public int getArticlesUnderTakeOverSection() {
			return articlesUnderTakeOverSection.size();
			
		}
	 public boolean takeOverFlowedLatestIsDisplayed() {
			boolean result=false;
			if(takeOverFollowedLatestNews.isDisplayed())
			{
				result=true;
			}
			return result;
			
		}
	 
	 public int oneUPArticles() {
			
			return oneUpArticles.size();
			
		}
	 
	 public int twoUpSecondaryArticles() {
			
			return twoUpArticles.size();
			
		}
	 
	 public int threeUpArticles() {
			
			return threeUpArticles.size();
			
		}
	 public boolean searchNewsroomPopularTopicsIsDisplayed() {
			boolean result=false;
			if(searchNewsroomPopularTopics.isDisplayed()) {
			result=true;
		}
			return result;
			
		}
	 
	 public boolean popularTopicsbesideSearchNewsroomIsDisplayed() {
			boolean result=false;
			if(popularTopicsbesideSearchNewsroom.isDisplayed()) {
			result=true;
		}
			return result;
			
		}
	 
	 
	 public boolean newsroombesideSearchNewsroomIsDisplayed() {
			boolean result=false;
			if(newsroombesideSearchNewsroom.isDisplayed()) {
			result=true;
		}
			return result;
			
		}
	 
	 public void newsroomHyperlink() {
			
			newsroomHyperlink.click();
			
			}
	 
	 public void popularTopics()
	 {
		 popularTopics.click();
	
	 }
	 
	 public void macInPopularTopics()
	 {
		 mac_popularTopics.click();
	 }
	 
	 public boolean Mac_related_articles_isDisplayed()
	 
	 {
		 boolean result=false;
			if(Mac_related_articals.isDisplayed()) {
			result=true;
		}
			return result;
		 
	 }
	 
	 public void clicks_on_searchNewsroom()
	 {
		 searchNewsroom.click();
		 
	 }
	 
	 public void enter_Macbook_Keyword(String enter)
	 {
		 EnterText.clear();
		 EnterText.sendKeys(enter);
		
	 }
	 
	 public void clickenter()
	 {
		 EnterText.sendKeys(Keys.ENTER);
	 }
	 

	 public boolean Macbook_related_articles_isDisplayed()
	 
	 {
		 boolean result=false;
			if(Macbook_related_articals.isDisplayed()) {
			result=true;
		}
			return result;
		 
	 }
	 
	 public boolean viewArchiveIsDisplayed() {
			boolean result=false;
			if(viewArchive.isDisplayed()) {
			result=true;
		}
			return result;
			
		}
	 public void clicks_on_viewArchive()
	 {
		 viewArchive.click();
	 }
	
	 
	}


