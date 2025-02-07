import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NjustaloSearchTest extends NjuskaloTest{
    @Test
    public void njuskaloSearchTest() throws InterruptedException {
        String searchText = "iPhone 16";
        WebElement searchTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"keywords\"]")));
        searchTextBox.sendKeys(searchText);
        searchTextBox.submit();
        WebElement testElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("SearchKeyword")));
        Assert.assertEquals(testElement.getText(), searchText);
    }
}
