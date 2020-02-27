package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import core.Base;


public class ObjectsForTestNG extends Base {

	public ObjectsForTestNG() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Test Environment']")
	private WebElement testEnvironmentLink;

	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccountWebelement;

	@FindBy(how = How.XPATH, using = "//a[text()='Register']")
	private WebElement registerWebElement;

	@FindBy(how = How.ID, using = "input-firstname")
	private WebElement firstName;

	@FindBy(how = How.ID, using = "input-lastname")
	private WebElement lastName;

	@FindBy(how = How.ID, using = "input-email")
	private WebElement emailAdd;

	@FindBy(how = How.ID, using = "input-telephone")
	private WebElement phone;

	@FindBy(how = How.ID, using = "input-password")
	private WebElement passWord;

	@FindBy(how = How.ID, using = "input-confirm")
	private WebElement passwordConfirm;

	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='1' and @name='newsletter']")
	private WebElement yesButton;

	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='0' and @name='newsletter']")
	private WebElement noButton;

	@FindBy(xpath = "//input[@type='submit' and @value='Continue']")
	private WebElement continueButton;

	@FindBy(how = How.XPATH, using = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedConfirmationText;
	
	//---------Login
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginMenu;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login;
	
	
	public void loginToAccount(String email, String password) {
		loginMenu.click();
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		login.click();
		
	}

	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.sendKeys(Keys.ENTER);
	}

	public void clickOnMyAccount() {
		try {

			myAccountWebelement.click();

		} catch (ElementNotInteractableException e) {

			myAccountWebelement.sendKeys(Keys.ENTER);

		}
	}

	public void clickonRegister() {
		try {
			registerWebElement.click();
		} catch (ElementNotInteractableException e) {

			registerWebElement.sendKeys(Keys.ENTER);

		}
	}

	public void fNameLName(String fName, String lName) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
	}

	public void email(String email) {
		emailAdd.sendKeys(email);
	}

	public void passConfirmPass(String password, String confPass) {
		passWord.sendKeys(password);
		passwordConfirm.sendKeys(confPass);

	}

	public void subscribeRadioButton(String yesOrNo) {
		if (yesOrNo.equalsIgnoreCase("Yes")) {
			yesButton.click();
		} else {
			noButton.click();
		}
	}

	public void clickOnContinue() {
		continueButton.click();
	}

}
