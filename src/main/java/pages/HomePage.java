package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
/*    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropDownLink = By.linkText("Dropdown");*/

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink(String linkTest) {
        driver.findElement(By.linkText(linkTest)).click();
    }

    public LoginPage clickFormAuthentication() {
        ;
        //driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropdown() {
        //driver.findElement(dropDownLink).click();
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUploadPage() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYG() {
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public NestedFrames clickNestedFrames() {
        clickLink("Nested Frames");
        return new NestedFrames(driver);
    }

    public DynamicLoadingpage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingpage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWndowPage clickMultipleWindow() {
        clickLink("Multiple Windows");
        return new MultipleWndowPage(driver);
    }

  /*  public void clicklink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }*/

}
