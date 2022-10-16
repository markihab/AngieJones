package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWndowPage {
    private WebDriver driver;
    private By clickHereButton = By.linkText("Click Here");

    public MultipleWndowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere() {
        driver.findElement(clickHereButton).click();
    }
}
