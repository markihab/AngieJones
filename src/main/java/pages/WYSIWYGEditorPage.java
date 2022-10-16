package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;

    private String editorIframeID = "mce_0_ifr";

    private By textArea = By.id("tinymce");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void typeTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromIFrame() {
        switchToEditArea();
        var text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorIframeID);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
