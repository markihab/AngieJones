package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyTest extends BaseTests {
    @Test
    public void testBackSpace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResultText(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPie() {
        var keypage = homePage.clickKeyPresses();
        keypage.enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
        //assertEquals(keypage.getResultText(),"");
    }
}
