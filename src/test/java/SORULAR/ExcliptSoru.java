package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;

public class ExcliptSoru {

    @Test
    public void test01(){

        //Iki tane metod olusturun : implicitWaitTest , explicitWaitTest
        //Iki metod icin de asagidaki adimlari test edin.
        //1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        //2. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        //3. “It’s gone!” mesajinin goruntulendigini dogrulayin.

        ReusableMethods.bekle(3);

        WebElement ItsGone=driver.findElement(By.xpath("//*[text()=\"It's gone!\"]"));

        Assert.assertTrue(ItsGone.isDisplayed());

        //4. Add buttonuna basin

        driver.findElement(By.xpath("//*[text()='Add']")).click();


        ReusableMethods.bekle(3);


        //5. It’s back mesajinin gorundugunu test edin

        WebElement ItsBacK=driver.findElement(By.xpath("//*[text()=\"It's back!\"]"));

        ItsBacK.isDisplayed();


    }

    @Test
    public void Test02(){

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        //1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.

        //3. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        //4. Add buttonuna basin
        //5. It’s back mesajinin gorundugunu test edin


        //1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        //2. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        //3. “It’s gone!” mesajinin goruntulendigini dogrulayin.

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));





        WebElement ItsGone=driver.findElement(By.xpath("//*[text()=\"It's gone!\"]"));

        Assert.assertTrue(ItsGone.isDisplayed());



    }

}
