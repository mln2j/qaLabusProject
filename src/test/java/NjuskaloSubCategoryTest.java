import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NjuskaloSubCategoryTest extends NjuskaloCategoryTest {
    @Test
    public void njuskaloSubCategoryTest() {
        njuskaloCategoryTest();
        WebElement housesForSaleLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='categoryLink subCategoryLink link' and @href='/prodaja-kuca']")));
        housesForSaleLink.click();
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        Assert.assertTrue(result.getText().contains("Prodaja kuća"));
    }
}
