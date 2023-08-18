package pages;

import libs.ConfigProvider;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ActionsWithElements {

    Logger logger = Logger.getLogger(getClass());
    protected WebDriver webDriver;

    protected WebDriverWait webDriverWait10, webDriverWait15;

    public ActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        webDriverWait10 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        webDriverWait15 = new WebDriverWait(webDriver, Duration.ofSeconds(ConfigProvider.configProperties.TIME_FOR_EXPLICIT_WAIT_LOW()));
    }

    public void enterTextIntoInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + " was inputted into " + getElementName(input));
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }

    }

    public void clickOnElement(WebElement element) {
        try {
            String elementName = getElementName(element);
            webDriverWait10.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            logger.info("Element was clicked" + elementName);
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            String elementName = getElementName(element);
            boolean state = element.isDisplayed();
            if (state) {
                logger.info("Element " + elementName + " is displayed");
            } else {
                logger.info("Element " + elementName + " is not displayed");
            }
            return state;
        } catch (Exception e) {
            String elementName = getElementName(element);
            logger.info("Element " + elementName + " is not displayed");
            return false;
        }
    }

    public void checkIsElementDisplayed(WebElement element) {
        String elementName = getElementName(element);
        Assert.assertTrue("Element " + elementName + " is not displayed", isElementDisplayed(element));
    }

    public void checkIsElementNotDisplayed(WebElement element) {
        String elementName = getElementName(element);
        Assert.assertFalse("Element " + elementName + " is displayed", isElementDisplayed(element));
    }

    public void hoverAndClickOnElement(WebElement element) {
        try {
            String elementName = getElementName(element);
            Actions action = new Actions(webDriver);
            action.moveToElement(element).click().build().perform();
            logger.info("Element " + elementName + " was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

//    public void clickOnElementByJS(WebElement element) {
//        try {
//            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
//            javascriptExecutor.executeScript("arguments[0].click();", element);
//            logger.info("Element " + getElementName(element) + " was clicked");
//        } catch (Exception e) {
//            printErrorAndStopTest(e);
//        }
//    }

    public void alertAccept() {
        webDriverWait10.until(ExpectedConditions.alertIsPresent());
        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        logger.info(alertText);
        alert.accept();
    }

    private String getElementName(WebElement element) {
        try {
            return element.getAccessibleName();
        } catch (Exception e) {
            return "";
        }
    }

    public void scrollToElement(WebElement element) {
        try {
            String elementName = getElementName(element);
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
            logger.info("Page was scrolled to" + elementName);
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    private void printErrorAndStopTest(Exception e) {
        logger.info("Can not work with element " + e);
        Assert.fail("Can not work with element " + e);
    }

}




