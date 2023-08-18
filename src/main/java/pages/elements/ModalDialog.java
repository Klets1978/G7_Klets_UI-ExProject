package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ActionsWithElements;

public class ModalDialog extends ActionsWithElements {

    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement modalDialog;

    @FindBy(xpath = "//button[@class=\"close\"]")
    private WebElement buttonClose;

    @FindBy(xpath = "//button[@id=\"closeSmallModal-ok\"]")
    private WebElement buttonOk;

    @FindBy(xpath = "//button[@id=\"closeSmallModal-ok\"]")
    private WebElement buttonCancel;

    public ModalDialog(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkIsModalDialogVisible() {
        webDriverWait10.until(d -> modalDialog.isDisplayed());
        checkIsElementDisplayed(modalDialog);
    }

    public void clickOnButtonClose() {
        clickOnElement(buttonClose);
    }

    public void clickOnButtonOk() {
        hoverAndClickOnElement(buttonOk);
    }

    public void clickOnButtonCancel() {
        clickOnElement(buttonCancel);
    }
}

