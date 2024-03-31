package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase_AfterBefore;

import java.util.List;

public class C02_İFramQuestions extends TestBase_AfterBefore {

    @Test
    public void ElektronicProducts(){

        //1- https://testotomasyonu.com/discount adresine gidin

        driver.get("https://testotomasyonu.com/discount");

        //2- Elektronics Products yazisinin gorunur olduğunu test edin

        WebElement Elektroniciframe=driver.findElement(By.xpath("(//iframe[@frameborder='1'])[1]"));
        driver.switchTo().frame(Elektroniciframe);

        WebElement ElektronicProduct=driver.findElement(By.tagName("h2"));
        Assert.assertTrue(ElektronicProduct.isDisplayed());


        //3- Dell bilgisayar urun isminin ‘DELL Core I3 11th Gen’ olduğunu test edin

        WebElement DellPc=driver.findElement(By.xpath("//span[text()='DELL Core I3 11th Gen ']"));
        String expectedDell="DELL Core I3 11th Gen";
        String actualDell=DellPc.getText();

        Assert.assertEquals(actualDell,expectedDell);


        //4- Sagdaki bolumde gorunen urunler arasinda ‘Men Slim Fit’ içeren en az 1 urun olduğunu test edin
        driver.switchTo().defaultContent();

        WebElement iframe=driver.findElement(By.xpath("(//iframe[@frameborder='1'])[2]"));
        driver.switchTo().frame(iframe);

        List<WebElement> MenSlimFit=driver.findElements(By.xpath("//p[contains(text(),'Men Slim Fit Casual Shirt')]"));
         Assert.assertTrue(MenSlimFit.size()>0);

        //5- ‘Fashion’ yazisinin gorunur olduğunu test edin

       WebElement Fashion= driver.findElement(By.xpath("//*[text()='Fashion']"));

        String expectedFashion="Fashion";
        String actualFashion=Fashion.getText();

        Assert.assertEquals(actualFashion,expectedFashion);


        //6- ‘Here are some products’ yazisinin gorunur olduğunu test edin

        driver.switchTo().defaultContent();

        WebElement HereAreSome=driver.findElement(By.xpath("//*[text()='Here are some products.']"));

        String expectedHere="Here are some products.";
        String actualHere=HereAreSome.getText();

        Assert.assertEquals(actualHere,expectedHere);

        //7- Sayfayi kapatin


    }
}
