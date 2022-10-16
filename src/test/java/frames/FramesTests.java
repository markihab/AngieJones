package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWYSIWYG();
        editorPage.clearTextArea();

        String text1 = "hello";
        String text2 = "World";

        editorPage.typeTextArea(text1);
        editorPage.typeTextArea(text2);

        assertEquals(editorPage.getTextFromIFrame(), text1 + text2, "Error message");
    }
}
