package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class Questions25 extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");

        //3. Ana sayfanın başarıyla göründüğünü doğrulayın

        String expectedTittle="Automation Exercise";

        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTittle);


        //4. Sayfayı aşağıya doğru kaydırın



        WebElement abonelik=driver.findElement(By.xpath("//*[text()='Subscription']"));

        Actions actions=new Actions(driver);

        actions.click(abonelik).sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(4);



        //5. 'ABONELİK' seçeneğinin görünür olduğunu doğrulayın

        String expectedAbonelik="SUBSCRIPTION";

        String actualAbonelik=driver.findElement(By.xpath("//*[text()='Subscription']")).getText();

        Assert.assertEquals(actualAbonelik,expectedAbonelik);




        //6. Yukarı doğru hareket etmek için sağ alt taraftaki oka tıklayın

        driver.findElement(By.xpath("//*[@class='fa fa-angle-up']")).click();


        ReusableMethods.bekle(3);


        //7. Sayfanın yukarı kaydırıldığını ve 'Otomasyon Mühendisleri için Tam Teşekküllü uygulama
        // web sitesi' metninin ekranda göründüğünü doğrulayın.

        String expectedEngineer="Full-Fledged practice website for Automation Engineers";

        String actualEngineer=driver.findElement(By.xpath("(//*[text()='Full-Fledged practice website for Automation Engineers'])[2]")).getText();

        Assert.assertEquals(actualEngineer,expectedEngineer);
    }
}
