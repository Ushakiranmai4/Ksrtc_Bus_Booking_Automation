package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerDetailsPage {

	private WebDriver driver;

    @FindBy(xpath = "//input[@name='paxName[0]']")
    private WebElement passengerName;

    @FindBy(xpath = "//input[@name='paxGender[0]']")
    private WebElement passengerGender;

    @FindBy(xpath = "//input[@name='paxAge[0]']")
    private WebElement passengerAge;

    @FindBy(xpath = "//input[@name='paxConcessionType[0]']")
    private WebElement concessionDropdown;

    @FindBy(xpath = "//div[text()='GENERAL PUBLIC']")
    private WebElement selectConcession;

    @FindBy(xpath = "//div[text()='Proceed to Checkout']")
    private WebElement checkoutButton;

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillPassengerDetails(String name, String age) {
        passengerName.sendKeys(name);
        passengerGender.click();
        passengerAge.sendKeys(age);
        concessionDropdown.click();
        selectConcession.click();
        checkoutButton.click();
    }
}
