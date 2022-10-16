package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePassButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail() {
        driver.findElement(emailField).sendKeys("TAU@expample.com");
    }

    public void clickRetrievePassword() {
        driver.findElement(retrievePassButton).click();
    }
}
