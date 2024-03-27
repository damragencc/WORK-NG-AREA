package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class MoveTo extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //1- https://www.testotomasyonu.com/ adresine gidin

        driver.get("https://www.testotomasyonu.com/");


        //2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin

        WebElement KidsWear=driver.findElement(By.xpath("(//*[text()='Kids Wear'])[3]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(KidsWear).perform();

        //3- “Boys” linkine basin

        driver.findElement(By.xpath("//*[text()='Boys']")).click();
        ReusableMethods.bekle(2);

        //4- Acilan sayfadaki ilk urunu tiklayin
        driver.findElement(By.xpath("//*[@class='product-box mb-2 pb-1']")).click();

        //4- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin


        WebElement urunYazi=driver.findElement(By.xpath("//*[text()='Boys Shirt White Color']"));

        String expectedYazi="Boys Shirt White Color";
        String actualYazii=urunYazi.getText();

        Assert.assertEquals(actualYazii,expectedYazi);




    }
}
