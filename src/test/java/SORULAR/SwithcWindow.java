package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

import java.util.List;

public class SwithcWindow extends TestBase_AfterBefore
{

    @Test
    public void test01(){

       //● https://testotomasyonu.com/addremove/ adresine gidin.

        driver.get("https://testotomasyonu.com/addremove/");


        //● Sayfadaki textin “Add/Remove Elements” olduğunu doğrulayın.

        WebElement ElementYazimi= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        String expectedYazim="Add/Remove Elements";
        String actualYazim=ElementYazimi.getText();

        Assert.assertEquals(actualYazim,expectedYazim);


        //● Sayfa başlığının(title) “Test Otomasyonu” olduğunu doğrulayın.

        String expectedTittle="Test Otomasyonu";
        String actualTitle= driver.getTitle();

        //● ’Please click for Electronics Products’ linkine tiklayin.

        String ilkWindow= driver.getWindowHandle();

        driver.findElement(By.xpath("//*[text()='Please click for ']")).click();




        //● Electronics sayfasinin acildigini test edin

     ReusableMethods.switchWindow(driver,"https://testotomasyonu.com/category/7/products");

     String expectedSayfa="Electronics";
     String actualSayfa=driver.getTitle();

     Assert.assertTrue(actualSayfa.contains(expectedSayfa));


        //● Bulunan urun sayisinin 16 olduğunu test edin

       List<WebElement>urunSayisi=driver.findElements(By.xpath("//*[@*='product-box mb-2 pb-1']"));

        int expectedSayi =16;

        int actualSayi=urunSayisi.size();

        Assert.assertEquals(actualSayi,expectedSayi);


        //● Ilk actiginiz addremove sayfasina donun

        driver.switchTo().window(ilkWindow);

        //● Url’in addremove icerdigini test edin

        String expectedUrlIcerik = "addremove";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        ReusableMethods.bekle(2);


    }
}
