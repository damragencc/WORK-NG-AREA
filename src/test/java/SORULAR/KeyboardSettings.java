package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class KeyboardSettings extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //1- https://www.testotomasyonu.com sayfasina gidelim

        driver.get("https://www.testotomasyonu.com");

        //2- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin ve Enter’a basarak arama yaptirin

        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        Actions actions=new Actions(driver);
        ReusableMethods.bekle(2);
        actions.click(aramaKutusu).sendKeys(Keys.DOWN).sendKeys("DELL Core I3"+Keys.ENTER).perform();
        ReusableMethods.bekle(2);


        //3- Bulunan urun isminde “DELL Core I3” bulundugunu test edin

        String actualIsim = driver.findElement(By.xpath("//*[@class='prod-title mb-3 ']"))
                .getText();
        String expectedIsimIcerik = "DELL Core I3";

        Assert.assertTrue(actualIsim.contains(expectedIsimIcerik));


    }
}
