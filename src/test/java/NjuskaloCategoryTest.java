import org.example.NjuskaloTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NjuskaloCategoryTest extends NjuskaloTest {
    @Test
    public void njuskaloCategoryTest() {
        WebElement realEstateLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='categoryLink inner link' and @href='/nekretnine']")));
        realEstateLink.click();
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        Assert.assertTrue(result.getText().contains("Nekretnine"));
    }
}
