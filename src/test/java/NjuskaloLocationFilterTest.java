import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NjuskaloLocationFilterTest extends NjuskaloSubCategoryTest{
    @Test
    public void njuskaloLocationFilterTest(){
        njuskaloSubCategoryTest();
        WebElement regionLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='CategoryListing-topCategoryLink' and @href='https://www.njuskalo.hr/prodaja-kuca/osjecko-baranjska']")));
        regionLink.click();
        WebElement cityLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='CategoryListing-topCategoryLink' and @href='https://www.njuskalo.hr/prodaja-kuca/osijek']")));
        cityLink.click();
        WebElement testElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='ContentHeader-description']")));
        Assert.assertEquals(testElement.getText(), "Njuškalo nekretnine: prodaja kuća Osijek");
    }
}
