package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Helper {
    public Helper() {

    }

    public static String takescreenshot(WebDriver driver) {
        try {
            String fileSeparator = System.getProperty("file.separator");
            String extentReportsPath =System.getProperty("user.dir") +
                    "src" +fileSeparator +"test"+fileSeparator+"java"+fileSeparator+
                    "reporting"+fileSeparator+"shopQATestReport";
            String screenshotPath = extentReportsPath + fileSeparator + "screeshots";

            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String screenshotName = "screenshot"+ LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy_HH.mm.ss"));
            String screenshot = screenshotPath + fileSeparator + screenshotName;
            FileUtils.copyFile(file, new File(screenshot));
            return "." + fileSeparator+ "screenshots" + fileSeparator+screenshotName;

        }
        catch (Exception ex){
            Assert.fail("Test failed to take screenshot" + ex);
            throw new RuntimeException(ex);
        }

    }

}
