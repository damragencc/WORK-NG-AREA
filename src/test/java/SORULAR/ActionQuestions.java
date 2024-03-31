package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class ActionQuestions extends TestBase_AfterBefore {

    @Test
    public void test01(){

   //1- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");


        //2- video’yu gorecek kadar asagi inin

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement iframe=driver.findElement(By.xpath("(//iframe)[1]"));

        driver.switchTo().frame(iframe);

        ReusableMethods.bekle(2);

        //actions.scrollToElement(iframeElementi);


        //3- videoyu izlemek icin Play tusuna basin


        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();




        //4- videoyu calistirdiginizi test edin
        WebElement playOynat= driver.findElement(By.xpath("//*[@aria-label='Duraklat klavye kısayolu k']"));

        Assert.assertTrue(playOynat.isEnabled());

        ReusableMethods.bekle(2);
    }
}
