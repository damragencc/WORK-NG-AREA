package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase_BeforeAfterClass;

public class C03_Soru extends TestBase_BeforeAfterClass {

    @Test
    public void test01(){

        // a. Verilen web sayfasına gidin.
        //      https://testotomasyonu.com/form

        driver.get("https://testotomasyonu.com/form");


        // b. Cinsiyet Radio button elementlerini locate edin

        WebElement cinsiyert=driver.findElement(By.xpath("//*[@id='inlineRadio1']"));

        WebElement Erkek=driver.findElement(By.xpath("//*[@id='inlineRadio2']"));


        WebElement Diger=driver.findElement(By.xpath("//*[@id='inlineRadio3']"));





        // d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin


        }
    @Test
    public void test02(){

        // c. Iki farkli test method’u oluşturup yazidan veya direk buton’dan size uygun olani secin

        // d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin


        WebElement Erkek=driver.findElement(By.xpath("//*[@id='inlineRadio2']"));

        Assert.assertTrue(Erkek.isSelected());


        WebElement DigeriSeciliolmayan=driver.findElement(By.xpath("//*[@id='inlineRadio1']"));

        Assert.assertFalse(DigeriSeciliolmayan.isSelected());


        WebElement Diger=driver.findElement(By.xpath("//*[@id='inlineRadio3']"));

        Assert.assertFalse(Diger.isSelected());




    }

}
