package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var file = homePage.clickFileUploadPage();
        file.uploadTheFile("C:\\Users\\mark ihab\\Desktop\\AngieJones\\resources\\chromedriver.exe");
        file.clickSubmitFileButton();
        assertEquals(file.getUploadedFileName(), "chromedriver.exe", "Wrong Text");
    }

}

