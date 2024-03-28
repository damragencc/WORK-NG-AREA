package SORULAR;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class SORUUU extends TestBase_AfterBefore {

    @Test
    public void test01() {
        Actions actions = new Actions(driver);
        driver.get("https://www.testotomasyonu.com");
        WebElement adress = driver.findElement(By.xpath("//*[text() ='Top Brands']"));
        actions.keyDown(adress, Keys.TAB).perform();
        ReusableMethods.bekle(3);
    }
}
