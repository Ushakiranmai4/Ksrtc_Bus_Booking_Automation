package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

	private WebDriver driver;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[3]/div[2]/div[1]/div/div/div[5]/div[7]/div")
    private WebElement selectBus;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]")
    private WebElement selectSeat;

    @FindBy(xpath = "//div[text()='Select Boarding Point']")
    private WebElement boardingPoint;

    @FindBy(xpath = "//div[text()='KEMPEGOWDA BS MAJESTIC']")
    private WebElement selectBoarding;

    @FindBy(xpath = "//div[text()='Select Dropping Point']")
    private WebElement droppingPoint;

    @FindBy(xpath = "//div[text()='MYSURU BUS STAND ']")
    private WebElement selectDropping;

    @FindBy(xpath = "//div[@class='btnPassDetails']")
    private WebElement proceedButton;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void bookBus() {
        selectBus.click();
        selectSeat.click();
        boardingPoint.click();
        selectBoarding.click();
        droppingPoint.click();
        selectDropping.click();
        proceedButton.click();
    }
}
