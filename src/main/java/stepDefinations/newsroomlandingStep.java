package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.Newsroompageobjects;
import util.Browser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newsroomlandingStep {

	public WebDriver driver;
	private Newsroompageobjects nrp = new Newsroompageobjects(Browser.getDriver());


	/*
	 * @Then("User must able to see {string} on Newsroom US Landing Page") public
	 * void user_must_able_to_see_on_newsroom_us_landing_page(String string) throws
	 * InterruptedException { Thread.sleep(3000);
	 * nrp.latestNewsHeadingIsDisplayed(); }
	 */

//
//	@Then("User must able to see {int} articles should be displayed under Latest News section on Newsroom US Landing Page")
//	public void user_must_able_to_see_articles_should_be_displayed_under_latest_news_section_on_newsroom_us_landing_page(
//			Integer int1) {
//
//		Assert.assertTrue(nrp.getArticlesCountUnderLatestNews() == 11);
//	}

	@Then("User must able to see {int} articles should be displayed under More from Newsroom section on Newsroom US Landing Page")
	public void user_must_able_to_see_articles_should_be_displayed_under_more_from_newsroom_section_on_newsroom_us_landing_page(
			Integer int1) {
		Assert.assertTrue(nrp.getArticlesCountUnderMoreFromNewsroom() == 8);
	}

	@Then("User must see {string}  is available on Takeover section of Newsroom US landing page")
	public void user_must_see_is_available_on_takeover_section_of_newsroom_us_landing_page(String string) {
		Assert.assertTrue(nrp.eventBrandingimageIsDisplayed());
	}

	@Then("User must see {string} is on Takeover section of Newsroom US landing page")
	public void user_must_see_is_on_takeover_section_of_newsroom_us_landing_page(String string) {
		Assert.assertTrue(nrp.takeOverHeaderIsDisplayed());
	}

	@Then("User must see {string} above event branding image and contains Search Newsroom and Popular Topics on Newsroom US landing page")
	public void user_must_see_above_event_branding_image_and_contains_search_newsroom_and_popular_topics_on_newsroom_us_landing_page(
			String string) {
		Assert.assertTrue(nrp.localNovDisplayIsDisplayed());
	}
	
	
	@Then("User must see {string} on Takeover section of Newsroom US landing page")
	public void user_must_see_on_takeover_section_of_newsroom_us_landing_page(String string) {
		Assert.assertTrue(nrp.watchEventCTAIsDisplayed());
	}

	@Then("User must able to click on Watch Event CTA on Takeover section of Newsroom US landing page")
	public void user_must_able_to_click_on_watch_event_cta_on_takeover_section_of_newsroom_us_landing_page() {
		Assert.assertTrue(nrp.watchEventCTAClick());

	}

	@Then("User must able to see less than {int} articles displayed under Takeover section in Newsroom US landing page")
	public void user_must_able_to_see_less_than_articles_displayed_under_takeover_section_in_newsroom_us_landing_page(
			Integer int1) {
		Assert.assertTrue(nrp.getArticlesUnderTakeOverSection() <= 14);

	}

	@Then("User must able to see the pattern of fourteen article are OneUp plus OneUp plus OneUp plus TwoUp plus TwoUp TwoUp plus TwoUp plus ThreeUp in Takeover section of Newsroom US landing page")
	public void user_must_able_to_see_the_pattern_of_fourteen_article_are_1up_1up_1up_2up_2up_2up_2up_3up_in_takeover_section_of_newsroom_us_landing_page()  {
		Assert.assertTrue(nrp.oneUPArticles() <= 3);
		Assert.assertTrue(nrp.twoUpSecondaryArticles() <= 8);
		Assert.assertTrue(nrp.threeUpArticles() <= 3);
		
	}

	@Then("User must able to see the Take over section followed by Latest News section on Newsroom US landing page.")
	public void user_must_able_to_see_the_take_over_section_followed_by_latest_news_section_on_newsroom_us_landing_page() {
		Assert.assertTrue(nrp.takeOverFlowedLatestIsDisplayed());

	}
	
   
	@Then("User must able to see {string} on LocalNov of Newsroom US landing page.")
	public void user_must_able_to_see_on_local_nov_of_newsroom_us_landing_page(String string) {
		Assert.assertTrue(nrp.searchNewsroomPopularTopicsIsDisplayed());
	}
	
	@Then("User must able to see popular topics beside Newsroom search field on Local Nav of Newsroom US landing page")
	public void user_must_able_to_see_popular_topics_beside_newsroom_search_field_on_local_nav_of_newsroom_us_landing_page() {
		Assert.assertTrue(nrp.popularTopicsbesideSearchNewsroomIsDisplayed());
	}
	@Then("User must able to see Newsroom Hyperlink beside Newsroom search field on Local Nav of Newsroom US landing page")
	public void user_must_able_to_see_newsroom_hyperlink_beside_newsroom_search_field_on_local_nav_of_newsroom_us_landing_page() {
		Assert.assertTrue(nrp.newsroombesideSearchNewsroomIsDisplayed());
	}

	@Then("User clicks on {string}")
	public void user_clicks_on(String string) {
		nrp.newsroomHyperlink();
		
	}

	@Then("User must see the Newsroom US landing page")
	public void user_must_see_the_newsroom_us_landing_page() {
		String actualTitle=Browser.getDriver().getTitle();
		String expectedTitle= "Newsroom - Apple";
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

	@Then("User clicks on Popular Topic section")
	public void user_clicks_on_popular_topic_section() throws InterruptedException {
		
		nrp.popularTopics();
		Thread.sleep(2000);
	   
	}
	@Then("User clicks on Mac in the Popular Topic section")
	public void user_clicks_on_mac_in_the_popular_topic_section() throws InterruptedException {
		 nrp.macInPopularTopics();
		 Thread.sleep(2000);
	}

	@Then("User must able to see articles related to the Mac in the Newsroom US landing page.")
	public void user_must_able_to_see_articles_related_to_the_Mac_in_the_newsroom_us_landing_page() {
	  
		nrp.Mac_related_articles_isDisplayed();
	}

	@Then("User clicks on Search Newsroom")
	public void user_clicks_on_search_newsroom() throws InterruptedException {
	 nrp.clicks_on_searchNewsroom();
	 Thread.sleep(2000);
	}            
	@Then("User should able to enter as {string} keyword in the Search Newsroom")
	public void user_should_able_to_enter_as_keyword_in_the_search_newsroom(String enter) throws InterruptedException {
	    nrp.enter_Macbook_Keyword(enter);
	}

	@Then("User should must able to click on enter")
	public void user_should_must_able_to_click_on_enter() throws InterruptedException {
		
		nrp.clickenter();
		Thread.sleep(2000);
	}

	@Then("User must able to see articles related to the Macbook in the Newsroom US landing page.")
	public void user_must_able_to_see_articles_related_to_the_macbook_in_the_newsroom_us_landing_page() {
		
//		driver.get("https://www.apple.com/newsroom/search?q=Macbook");
//		String CurrentURL = driver.getCurrentUrl();
//		System.out.println(CurrentURL);
//		nrp.Macbook_related_articles_isDisplayed();
		
		String actualTitle=Browser.getDriver().getTitle();
		String expectedTitle= "Macbook - Newsroom - Search";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("User must able to see View archives button at the bottom of the Newsroom US landing page.")
	public void user_must_able_to_see_view_archives_button_at_the_bottom_of_the_newsroom_us_landing_page() {
		
		Assert.assertTrue(nrp.viewArchiveIsDisplayed());
	}

	@Then("User clicks on View archives button")
	public void user_clicks_on_view_archives_button() {
	  
		nrp.clicks_on_viewArchive();
	}

	@Then("User must able to see the newsroom archives page")
	public void user_must_able_to_see_the_newsroom_archives_page() {
		String actualTitle=Browser.getDriver().getTitle();
		Assert.assertTrue(actualTitle.contains("Apple"));
		
	}
	
	@Then("User must able to see {string} on LocalNov of Newsroom zh-CN landing page.")
	public void user_must_able_to_see_on_local_nov_of_newsroom_zh_cn_landing_page(String string) {
		Assert.assertTrue(nrp.searchNewsroomPopularTopicsIsDisplayed());
	}

	@Then("User must able to see popular topics beside Newsroom search field on Local Nav of Newsroom Uzh-CN landing page")
	public void user_must_able_to_see_popular_topics_beside_newsroom_search_field_on_local_nav_of_newsroom_uzh_cn_landing_page() {
		Assert.assertTrue(nrp.popularTopicsbesideSearchNewsroomIsDisplayed());
	}

	@Then("User must able to see Newsroom Hyperlink beside Newsroom search field on Local Nav of Newsroom Uzh-CN landing page")
	public void user_must_able_to_see_newsroom_hyperlink_beside_newsroom_search_field_on_local_nav_of_newsroom_uzh_cn_landing_page() {
		Assert.assertTrue(nrp.newsroombesideSearchNewsroomIsDisplayed());
	}

	@Then("User must see the Newsroom Uzh-CN landing page")
	public void user_must_see_the_newsroom_uzh_cn_landing_page() {
		String actualTitle=Browser.getDriver().getTitle();
		String expectedTitle= "Newsroom - Apple (中国大陆)";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("User must able to see articles related to the Mac in the Newsroom Uzh-CN landing page.")
	public void user_must_able_to_see_articles_related_to_the_mac_in_the_newsroom_uzh_cn_landing_page() {
		nrp.Mac_related_articles_isDisplayed();

	}

	@Then("User must able to see articles related to the Macbook in the Newsroom Uzh-CN landing page.")
	public void user_must_able_to_see_articles_related_to_the_macbook_in_the_newsroom_uzh_cn_landing_page() {
		nrp.Macbook_related_articles_isDisplayed();
	}

	@Then("User must able to see View archives button at the bottom of the Newsroom zh-CN landing page.")
	public void user_must_able_to_see_view_archives_button_at_the_bottom_of_the_newsroom_zh_cn_landing_page() {
		Assert.assertTrue(nrp.viewArchiveIsDisplayed());
	}

	@Then("User should directed to newsroom archives page")
	public void user_should_directed_to_newsroom_archives_page() {
		String actualTitle=Browser.getDriver().getTitle();
		Assert.assertTrue(actualTitle.contains("Apple"));
		
	}

}

	
	

