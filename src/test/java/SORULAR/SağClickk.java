package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class SağClickk extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin

        driver.get("https://the-internet.herokuapp.com/context_menu");

        //3- Cizili alan uzerinde sag click yapin

        Actions actions=new Actions(driver);

        WebElement Alan=driver.findElement(By.xpath("//*[@id='hot-spot']"));

        actions.contextClick(Alan).perform();

        ReusableMethods.bekle(2);


        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin

        String expectedYazi="You selected a context menu";
        String actualYazi=driver.switchTo().alert().getText();

        Assert.assertEquals(actualYazi,expectedYazi);


        //5- Tamam diyerek alert’i kapatalim

        driver.switchTo().alert().accept();

        //6- Elemental Selenium linkine tiklayalim
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();



        //7- Acilan sayfada h1 taginda “Make sure your code lands” yazdigini test edelim

        ReusableMethods.switchWindow(driver,"https://elementalselenium.com/");

        String expectedMake="Elemental Selenium";
        String actualMake=driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).getText();

        Assert.assertEquals(actualMake,expectedMake);
    }
}
