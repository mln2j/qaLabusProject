import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NjuskaloCategoryTest extends NjuskaloTest {
    @Test
    public void njuskaloCategoryTest() throws InterruptedException {
        WebElement marketplaceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='categoryLink inner link' and @href='/marketplace']")));
        System.out.println(marketplaceLink.getText());
        marketplaceLink.click();
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        Assert.assertTrue(result.getText().contains("Marketplace"));
    }
}
