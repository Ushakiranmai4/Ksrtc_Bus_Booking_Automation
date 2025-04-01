package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	private WebDriver driver;

	@FindBy(id = "fromCity_chosen")
	private WebElement fromCityDropdown;

	@FindBy(xpath = "//div[@id='fromCity_chosen']//input")
	private WebElement fromCityInput;

	@FindBy(id = "toCity_chosen")
	private WebElement toCityDropdown;

	@FindBy(xpath = "//div[@id='toCity_chosen']//input")
	private WebElement toCityInput;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[1]/td[6]/a")
	private WebElement datePicker;

	@FindBy(id = "submitSearch")
	private WebElement searchButton;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchBus(String fromCity, String toCity) {
		fromCityDropdown.click();
		fromCityInput.sendKeys(fromCity);
		fromCityInput.sendKeys(org.openqa.selenium.Keys.TAB);
		toCityDropdown.click();
		toCityInput.sendKeys(toCity);
		toCityInput.sendKeys(org.openqa.selenium.Keys.TAB);
		datePicker.click();
		searchButton.click();
	}

}
