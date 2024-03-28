package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase_BeforeAfterClass;

public class Soru extends TestBase_BeforeAfterClass {

    @Test
    public void test01(){
        //1. Test
        //	-  https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get(" https://testotomasyonu.com/javascriptAlert");


        //	- 1.alert'e tiklayin

        WebElement alert=driver.findElement(By.xpath("//*[text()='Click for JS Alert']"));

        alert.click();


        //	-  Alert'deki yazinin "I am a JS Alert" oldugunu test edin

        String expected="I am a JS Alert";

        String actual=driver.switchTo().alert().getText();

        driver.switchTo().alert().accept();
        //	-  OK tusuna basip alert'i kapatin



    }
@Test
    public void test02(){

    //2.Test
    //	- https://testotomasyonu.com/javascriptAlert adresine gidin

    driver.get("https://testotomasyonu.com/javascriptAlert");

    //	- 2.alert'e tiklayalim
    WebElement alert=driver.findElement(By.xpath("//*[text()='Click for JS Confirm']"));

    alert.click();

    //	- Cancel'a basip,

    driver.switchTo().alert().dismiss();

    //	cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin

    String expected="You clicked: Cancel";

    String actual=driver.findElement(By.xpath("//*[text()='You clicked: Cancel']")).getText();

Assert.assertEquals(actual,expected);



}




    //3.Test
    //	- https://testotomasyonu.com/javascriptAlert adresine gidin
    //3.Test
    //	- https://testotomasyonu.com/javascriptAlert adresine gidin
    //	- OK tusuna basarak alert'i kapatalim
    //	- Cikan sonuc yazisinin Rasit icerdigini test edeli
}
