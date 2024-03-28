package SORULAR;

import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class C02_Soru extends TestBase_AfterBefore {

    @Test
    public void test01(){

        // a. Verilen web sayfasına gidin.
        //     https://testotomasyonu.com/form
        // b. Sirt Agrisi ve Carpinti checkbox’larini secin
        // c. Sirt Agrisi ve Carpinti checkbox’larininin seçili olduğunu test edin
        // d. Seker ve Epilepsi checkbox’larininin seçili

        driver.get(" https://testotomasyonu.com/form");

        // b. Sirt Agrisi ve Carpinti checkbox’larini secin

        WebElement carpinti=driver.findElement(By.xpath("//*[@id='gridCheck4']"));

        WebElement sirtAgrısı=driver.findElement(By.xpath("//*[@id='gridCheck5']"));
        carpinti.click();
        sirtAgrısı.click();


        Assert.assertTrue(carpinti.isSelected());
        Assert.assertTrue(sirtAgrısı.isSelected());

        // d. Seker ve Epilepsi checkbox’larininin seçili













        ReusableMethods.bekle(3);






    }
}
