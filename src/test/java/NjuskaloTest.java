import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NjuskaloTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public String url = "https://www.njuskalo.hr/";

    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.navigate().to(url);
        WebElement acceptButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[3]/button[2]"));
        acceptButton.click();
        wait = new WebDriverWait(driver, 30);
        WebElement privacyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[2]/button")));
        privacyButton.click();
    }

    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}
