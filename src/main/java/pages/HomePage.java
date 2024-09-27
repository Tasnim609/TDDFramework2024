package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.w3c.dom.ls.LSException;

import constants.Attribute;

// new, you have to manually write it to get access of common actions
// this is possible when they are static in nature, * means all
// This is called static import
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class HomePage {
	public WebDriver driver;
	public WebDriverWait wait;
	JavascriptExecutor js;
	Actions actions;

	// parameterized constructor initialized when class in instantiated [object
	// created]
	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory class help to instantiate WebElements
		// Important interview question
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);

	}

	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3' ]")
	WebElement logo;

	@FindBy(id = "cms-login-submit")
	WebElement loginButton;

	@FindBy(className = "cms-newuser-reg")
	WebElement newUserRegistration;

	@FindBy(css = "em.cms-icon.cms-sprite-loggedout.ms-3")
	WebElement logoByCssSelector;

	public void click_logo() {
		logo.click(); // common method 'clickElement()' is not used here
	}

	// We used throws to handle exception in this method
	public void click_login_button() {
		pause(4000); // common method 'pause()' is used from here
		clickElement(loginButton); // common method 'clickElement()' is used from here
		pause(4000);
	}

}
