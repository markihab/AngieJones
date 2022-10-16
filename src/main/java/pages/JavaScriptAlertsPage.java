package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");

    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");

    private By alertMessageResult = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getAlertMessageResult() {
        return driver.findElement(alertMessageResult).getText();
    }

    public void triggerConfirmMessage() {
        driver.findElement(triggerConfirmButton).click();
    }

    public String getAlertConfirmMessage() {
        return driver.switchTo().alert().getText();
    }

    public void dismissConfirmMessage() {
        driver.switchTo().alert().dismiss();
    }

    public String getMessagePrinted() {
        return driver.findElement(alertMessageResult).getText();
    }

    public void clickJSPromptButton() {
        driver.findElement(triggerPromptButton).click();
    }

    public void setAlertPromptField(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

}
