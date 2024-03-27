package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class Drop extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //1- https://testotomasyonu.com/droppable adresine gidelim

        driver.get("https://testotomasyonu.com/droppable");

        //2- Accept bolumunde “Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim

        Actions actions=new Actions(driver);
        WebElement AcceptKutu=driver.findElement(By.xpath("//*[@id='draggable2']"));

        WebElement  DropKutu=driver.findElement(By.xpath("//*[@id='droppable2']"));

        ReusableMethods.bekle(1);

        actions.dragAndDrop(AcceptKutu,DropKutu).perform();

        ReusableMethods.bekle(2);


        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin


        WebElement DropHereYazi=driver.findElement(By.xpath("//*[text()='Dropped!']"));

        Assert.assertTrue(DropHereYazi.isDisplayed());


        //4- Sayfayi yenileyin
        driver.navigate().refresh();


        //5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim

        WebElement NotAccept=driver.findElement(By.xpath("//*[@id='draggable-nonvalid2']"));


        WebElement Droppedd=driver.findElement(By.xpath("//*[@id='droppable2']"));

        ReusableMethods.bekle(2);



        actions.dragAndDrop(NotAccept,Droppedd).perform();

        ReusableMethods.bekle(2);



        //6- “Drop Here” yazisinin degismedigini test edin

        driver.findElement(By.xpath("//*[text()='Drop Here']")).isDisplayed();


    }
}
