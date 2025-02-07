import io.github.cdimascio.dotenv.Dotenv;
import org.example.NjuskaloTest;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NjuskaloLoginTest extends NjuskaloTest {
    @Test
    public void njuskaloLoginTest() {
        Dotenv dotenv = Dotenv.load();

        String username = dotenv.get("NJUSKALO_USERNAME");
        String password = dotenv.get("NJUSKALO_PASSWORD");

        WebElement loginLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='Header-authNavItem Header-authNavItem--login is-interactive' and @href='/prijava/']")));
        loginLink.click();
        WebElement inputUsername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login_username\"]")));
        inputUsername.sendKeys(username);
        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login_password\"]")));
        inputPassword.sendKeys(password);
        inputUsername.submit();
        try {
            WebElement testElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("BlockStandard-title")));
            Assert.assertEquals(testElement.getText(), "Unesi sigurnosni kod");
        } catch (TimeoutException e) {
            WebElement testElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Header-userCaption")));
            Assert.assertEquals(testElement.getText(), username);
        }
    }
}
