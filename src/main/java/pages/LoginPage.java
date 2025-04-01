package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//*[@id=\\\"root\\\"]/div/div[3]/div[2]/div/div[1]/input")
	private WebElement emailField;

	@FindBy(xpath = "//*[@id=\\\"root\\\"]/div/div[3]/div[2]/div/div[3]/input")
	private WebElement mobileNumber;

	@FindBy(xpath = "//*[@id=\\\"root\\\"]/div/div[3]/div[2]/div/div[4]/input")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id=\\\"root\\\"]/div/div[3]/div[2]/div/div[7]/div[1]")
	private WebElement checkBoxField;

	@FindBy(xpath = "//*[@id='root']/div/div[3]/div[4]")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void login(String email, String mobile, String password) {
		emailField.sendKeys(email);
		mobileNumber.sendKeys(mobile);
		passwordField.sendKeys(password);
		checkBoxField.click();
		loginButton.click();
	}

}
