import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class C01_AlertSoru extends TestBase_AfterBefore {

    @Test

    public void test01(){


        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        // 2 ) Bir metod olusturun: iframeTest
        driver.get("https://the-internet.herokuapp.com/iframe");


        // - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.

        WebElement AniFrame=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(AniFrame.isDisplayed());
        System.out.println(AniFrame.getText());


        // - Text Box’a “Merhaba Dunya!” yazin.

        WebElement iFrameElementi = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iFrameElementi);

        ReusableMethods.bekle(2);


        WebElement Yaziyaz=driver.findElement(By.xpath("//body[@id='tinymce']"));
        Yaziyaz.clear();


        Yaziyaz.sendKeys("Merhaba Dunya");

        ReusableMethods.bekle(2);

        // - TextBox’in altinda bulunan “Elemental Selenium” linkinin gorunur oldugunu dogrulayin ve  yazisini konsolda yazdirin.

        driver.switchTo().parentFrame();

        WebElement ElementalSelenium= driver.findElement(By.linkText("Elemental Selenium"));

        Assert.assertTrue(ElementalSelenium.isDisplayed());

        System.out.println(ElementalSelenium.getText());

        ReusableMethods.bekle(2);



    }
}
