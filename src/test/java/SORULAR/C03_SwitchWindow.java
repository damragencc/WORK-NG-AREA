package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;
import utilities.TestBase_BeforeAfterClass;

public class C03_SwitchWindow extends TestBase_AfterBefore {






    @Test
    public void test01(){

        //● testotomasyonu anasayfa adresine gidin.
        driver.get("https://www.testotomasyonu.com");

        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String toWindownHandleDegeri=driver.getWindowHandle();

        //● Sayfa title’nin “Otomasyon” icerdigini test edin
        String expectedTittle="Otomasyon";
        String actualTittle=driver.getTitle();

        Assert.assertTrue(actualTittle.contains(expectedTittle));





    //● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin

       driver.switchTo().newWindow(WindowType.TAB).get("http://www.wisequarter.com");
        System.out.println("wisequarter WHD : " +driver.getWindowHandle());

        //● Sayfa title’nin “wisequarter” icerdigini test edin

        String expectedWise="Wise Quarter";
        String actualWise= driver.getTitle();

        Assert.assertTrue(actualWise.contains(expectedWise));




        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin


        driver.switchTo().newWindow(WindowType.TAB).get("http://www.Walmart.com");

        //● Sayfa title’nin “Walmart” icerdigini test edin

        String expectedWarmart = "Walmart";
        String actualWarmart = driver.getTitle();

        Assert.assertTrue(actualWarmart.contains(expectedWarmart));

        //● Ilk acilan sayfaya donun ve otomasyon sayfasina dondugunuzu test edin

        driver.switchTo().window(toWindownHandleDegeri);

        String expectedIcerik="Otomasyon";
        actualTittle=driver.getTitle();

        Assert.assertTrue(actualTittle.contains(expectedIcerik));





        ReusableMethods.bekle(2);

    }


    }
