package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class KeyboardAction extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //1- https://www.testotomasyonu.com adresine gidelim
        driver.get("https://www.testotomasyonu.com");

        //2- Account linkine tiklayin
        driver.findElement(By.xpath("(//*[text()='Account'])[1]")).click();

        //3- Sign Up linkine basalim
        driver.findElement(By.xpath("//*[@class='sign-up '] ")).click();



        //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim

        WebElement Buton = driver.findElement(By.id("firstName"));
        Actions actions=new Actions(driver);
        ReusableMethods.bekle(2);
        actions.click(Buton).sendKeys("Damraa").sendKeys(Keys.TAB)
                             .sendKeys("GENCC").
                              sendKeys(Keys.TAB).
                              sendKeys("damragennc7@gmail.com").
                              sendKeys(Keys.TAB)
                              .sendKeys("123456")
                              .sendKeys(Keys.TAB)
                               .sendKeys("123456").perform();


             ReusableMethods.bekle(2);
       driver.findElement(By.xpath("//*[text()=' Sign Up']")).click();



        ReusableMethods.bekle(2);




        //5- Kaydin olusturuldugunu test edin

       WebElement kayit=driver.findElement(By.xpath("//*[@id='email']"));
        kayit.sendKeys("damragennc7@gmail.com");

        WebElement paswword=driver.findElement(By.xpath("//*[@id='password'] "));
        paswword.sendKeys("123456");

        driver.findElement(By.xpath("//*[@class='submitbtn btn-lg']")).click();

        WebElement logoutButonu = driver.findElement(By.xpath("(//*[text()='Logout'])[2]"));

        Assert.assertTrue(logoutButonu.isDisplayed());

        ReusableMethods.bekle(5);
    }



    }




