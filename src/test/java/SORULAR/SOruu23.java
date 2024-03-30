package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase_AfterBefore;

public class SOruu23 extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' url'sine gidin

        driver.get("http://automationexercise.com");

        //3. Ana sayfanın başarıyla göründüğünü doğrulayın

        String expectedurl="Automation Exercise";
        String actualurl=driver.getTitle();

        Assert.assertEquals(actualurl,expectedurl);

        //4. 'Kaydol / Giriş Yap' butonuna tıklayın

        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();



        //5. Kayıt bölümündeki tüm bilgileri doldurun ve hesap oluşturun

        WebElement isim=driver.findElement(By.xpath("//*[@data-qa='signup-name']"));
         isim.sendKeys("DAMRAA");

         WebElement email= driver.findElement(By.xpath("(//*[@type='email'])[2]"));
         email.sendKeys("squard350@gmai425344.com");

         driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();

         driver.findElement(By.xpath("//*[@id='id_gender1']")).click();



       WebElement password=driver.findElement(By.xpath("//*[@data-qa='password']"));

       password.sendKeys("12345");

       WebElement GUn=driver.findElement(By.xpath("//*[@id='days']"));



        GUn.sendKeys("25");

        WebElement Ay=driver.findElement(By.xpath("//*[@id='months']"));


        Actions actions=new Actions(driver);

        actions.click(Ay).sendKeys("November").sendKeys(Keys.TAB).sendKeys("1993")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys("Damra")
                .sendKeys(Keys.TAB).sendKeys("GENC")
                .sendKeys(Keys.TAB).sendKeys("D&G")
                .sendKeys(Keys.TAB).sendKeys("Ege mahallesi")
                .sendKeys(Keys.TAB).sendKeys("Ege mahallesi")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("CALİFORNİA")
                .sendKeys(Keys.TAB)
                .sendKeys("LOS ANGELAS")
                .sendKeys(Keys.TAB)
                .sendKeys("06610")
                .sendKeys(Keys.TAB).sendKeys("5313269306").sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();




        //6. "HESAP OLUŞTURULDU!" ifadesini doğrulayın ve "Devam" düğmesine tıklayın

         String expected="ACCOUNT CREATED!";
         String actual=driver.findElement(By.xpath("//*[text()='Account Created!']")).getText();

         Assert.assertEquals(actual,expected);

         driver.findElement(By.xpath("//*[text()='Continue']")).click();



        //7. En üstteki 'Kullanıcı adı olarak giriş yapıldı' ifadesini doğrulayın

        String expectedLogin="Logged in as DAMRAA";

        String actualLogin=driver.findElement(By.xpath("//*[text()=' Logged in as ']")).getText();

        Assert.assertEquals(actualLogin,expectedLogin);




        //8. Ürünleri sepete ekleyin

        WebElement URUn=driver.findElement(By.xpath("(//*[@alt='ecommerce website products'])[5]"));

        Actions actions1=new Actions(driver);

        actions.moveToElement(URUn).perform();

        driver.findElement(By.xpath("(//*[@data-product-id='1'])[1]")).click();

        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();



        //9. 'Sepet' butonuna tıklayın

        driver.findElement(By.xpath("//*[@class='fa fa-shopping-cart']")).click();

        //10. Sepet sayfasının görüntülendiğini doğrulayın

        String expectedCard="Shopping Cart";

        String actualCard=driver.findElement(By.xpath("//*[text()='Shopping Cart']")).getText();

        Assert.assertEquals(actualCard,expectedCard);



        //11. Ödeme İşlemine Devam Et'e tıklayın

        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();


        //12. Teslimat adresinin hesap kaydı sırasında doldurulan adresle aynı olduğunu doğrulayın

          String expectedAdress="Ege mahallesi";

        String actualAdress=driver.findElement(By.xpath("(//*[text()='Ege mahallesi'])[1]")).getText();

        Assert.assertEquals(actualAdress,expectedAdress);





        //13. Fatura adresinin hesap kaydı sırasında doldurulan adresle aynı olduğunu doğrulayın


        String expectedBill="Ege mahallesi";

        String actualBill=driver.findElement(By.xpath("(//*[@class='address_address1 address_address2'])[5]")).getText();


        Assert.assertEquals(actualBill,expectedBill);


        //14. 'Hesabı Sil' düğmesine tıklayın

        driver.findElement(By.xpath("//*[@class='fa fa-trash-o']")).click();

        //15. "HESAP SİLİNDİ!" ifadesini doğrulayın ve "Devam" düğmesine tıklayın

        driver.findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed();

        driver.findElement(By.xpath("//*[text()='Continue']")).click();



    }

}
