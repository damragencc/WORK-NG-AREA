package SORULAR;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMExtractor;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class Soruu24 extends TestBase_AfterBefore {

    @Test
    public void test01(){

        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");

        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        driver.findElement(By.xpath("//*[@alt='Website for automation practice']")).isDisplayed();


        //4. Ürünleri sepete ekleyin

        WebElement URUn=driver.findElement(By.xpath("(//*[@alt='ecommerce website products'])[5]"));

        Actions actions=new Actions(driver);

        actions.moveToElement(URUn).perform();

        driver.findElement(By.xpath("(//*[@data-product-id='1'])[1]")).click();

        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();


        //5. 'Sepet' düğmesine tıklayın

        driver.findElement(By.xpath("//*[text()=' Cart']")).click();



        //6. Sepet sayfasının görüntülendiğini doğrulayın
        driver.findElement(By.xpath("//*[text()='Shopping Cart']")).isDisplayed();


        //7. Ödeme İşlemine Devam Et'e tıklayın

        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();




        //8. 'Kayıt Ol / Giriş Yap' butonuna tıklayın

        driver.findElement(By.xpath("//*[text()='Register / Login']")).click();


        //9. Kayıt ol kısmındaki tüm detayları doldurun ve hesap oluşturun


        WebElement Kayıtol= driver.findElement(By.xpath("//*[@placeholder='Name']"));
        Kayıtol.sendKeys("Damraa");
        WebElement email= driver.findElement(By.xpath("(//*[@placeholder='Email Address'])[2]"));
        email.sendKeys("damrangec3222220082@gmail.com");

        driver.findElement(By.xpath("//*[text()='Signup']")).click();

        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();

        WebElement pasword= driver.findElement(By.xpath("//*[@id='password']"));

        actions.click(pasword).sendKeys("12345")
                .sendKeys(Keys.TAB).sendKeys("25")
                .sendKeys(Keys.TAB).sendKeys("November")
                .sendKeys(Keys.TAB).sendKeys("1993")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys("Damra")
                .sendKeys(Keys.TAB).sendKeys("Genc")
                .sendKeys(Keys.TAB).sendKeys("D&G")
                .sendKeys(Keys.TAB).sendKeys("Ege mahallesi")
                .sendKeys(Keys.TAB).sendKeys("Ege mahallesi")
                .sendKeys(Keys.TAB).sendKeys("United States")
                .sendKeys(Keys.TAB).sendKeys("California")
                .sendKeys(Keys.TAB).sendKeys("Los Angelas")
                .sendKeys(Keys.TAB).sendKeys("06610")
                .sendKeys(Keys.TAB).sendKeys("5313269306")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


        //10. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın ve 'Devam' düğmesini tıklayın

        driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();

        driver.findElement(By.xpath("//*[text()='Continue']")).click();


        //11. Üstteki 'Kullanıcı adı olarak oturum açıldı' seçeneğini doğrulayın

        String expected="Logged in as Damraa";
        String actual=driver.findElement(By.xpath("//*[text()=' Logged in as ']")).getText();

        Assert.assertEquals(actual,expected);


        //12.'Sepet' butonuna tıklayın

        driver.findElement(By.xpath("//*[text()=' Cart']")).click();
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();



        //13. 'Ödeme İşlemine Devam Et' düğmesine tıklayın



        WebElement order=   driver.findElement(By.xpath("//*[text()='Place Order']"));

        actions.click(order).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);

        order.click();



        //14. Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin

        //16. Ödeme ayrıntılarını girin: Karttaki İsim, Kart Numarası, CVC, Son Kullanma Tarihi

        WebElement card=driver.findElement(By.xpath("//*[@data-qa='name-on-card']"));

       actions.click(card).sendKeys("Damra")
               .sendKeys(Keys.TAB).sendKeys("123456789")
               .sendKeys(Keys.TAB).sendKeys("111")
               .sendKeys(Keys.TAB).sendKeys("12")
             .sendKeys(Keys.TAB).sendKeys("1993")
           .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

         //17. 'Faturayı İndir' düğmesine tıklayın ve faturanın başarıyla indirildiğini doğrulayın.

        driver.findElement(By.xpath("//*[text()='Download Invoice']")).click();


        //18. 'Siparişiniz başarıyla verildi!' başarı mesajını doğrulayın.

        driver.findElement(By.xpath("//*[text()='Order Placed!']")).isDisplayed();


        //19. 'Öde ve Siparişi Onayla' düğmesine tıklayın

        driver.findElement(By.xpath("//*[text()='Continue']")).click();


        //21. 'Hesabı Sil' düğmesine tıklayın

        driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();

        //22. 'HESAP SİLİNDİ!' seçeneğini doğrulayın ve 'Devam' düğmesini tıklayın

        driver.findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed();

        driver.findElement(By.xpath("//*[text()='Continue']")).click();

    }
}