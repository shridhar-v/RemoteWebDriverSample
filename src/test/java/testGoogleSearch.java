import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Created by Shridhar on 3/17/2015.
 */

@Test
public class testGoogleSearch {
    @Test()
    public void testTalenticaIsDisplayedInSearchResult(){

        ChromeOptions chromeOpts = new ChromeOptions();
        chromeOpts.addArguments("test-type");
        WebDriver driver = new ChromeDriver(chromeOpts);
        driver.navigate().to("https://www.google.co.in/");
        driver.findElement(By.cssSelector("input.gsfi")).clear();
        driver.findElement(By.cssSelector("input.gsfi")).sendKeys("talentica software");
        driver.findElement(By.cssSelector("input.gsfi")).sendKeys(Keys.ENTER);
    }
}
