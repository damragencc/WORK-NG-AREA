package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class RightClick extends TestBase_AfterBefore {

    @Test
    public void test01(){
          //1- https://testotomasyonu.com/click sitesine gidin

        driver.get("https://testotomasyonu.com/click");

         //2- “DGI Drones” uzerinde sag click yapin

        Actions actions=new Actions(driver);


        WebElement DGIdrone=driver.findElement(By.xpath("//*[@id='pic2_thumb']"));
           ReusableMethods.bekle(1);
        actions.contextClick(DGIdrone).perform();

        ReusableMethods.bekle(2);

         //3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.

       String expectedAlertYazisi = "Tebrikler!... Sağ click yaptınız.";
       String actualAlertYazisi = driver.switchTo().alert().getText();

        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);






         //4- Tamam diyerek alert’i kapatalim

        driver.switchTo().alert().accept();




    }
}
