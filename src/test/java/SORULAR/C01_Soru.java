package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase_AfterBefore;

import java.util.List;

public class C01_Soru extends TestBase_AfterBefore
{

    // testotomasyonu anasayfaya gidin
    // nutella icin arama yapin
    // arama sonucunda urun bulunabildigini test edin
    // arama sonucunda urun bulunabildigini test edin

    @Test// testotomasyonu anasayfaya gidin
    public void test01(){
        // testotomasyonu anasayfaya gidin
        driver.get("http://www.testotomasyonu.com");
        // nutella icin arama yapin

        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@class='search-input']"));
        aramaKutusu.sendKeys("nutella"+Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin

        List<WebElement> aramaSonucu=driver.findElements(By.xpath("(//div[@class='product-box my-2  py-1'])[1]"));

        Assert.assertFalse(aramaSonucu.size()>0);

        System.out.println(aramaSonucu);







    }
}
