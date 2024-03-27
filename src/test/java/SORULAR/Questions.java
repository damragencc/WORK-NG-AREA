package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_AfterBefore;

public class Questions extends TestBase_AfterBefore{

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'New User Signup!' is visible
    //6. Enter name and email address
    //7. Click 'Signup' button
    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //9. Fill details: Title, Name, Email, Password, Date of birth
    //10. Select checkbox 'Sign up for our newsletter!'
    //11. Select checkbox 'Receive special offers from our partners!'
    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //13. Click 'Create Account button'
    //14. Verify that 'ACCOUNT CREATED!' is visible
    //15. Click 'Continue' button
    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        @Test
    public void test01(){
            //1. Launch browser
            //2. Navigate to url 'http://automationexercise.com'

            driver.get("http://automationexercise.com");

            //3. Verify that home page is visible successfully



            //4. Click on 'Signup / Login' button

           driver.findElement(By.xpath("//a[@href='/login']")).click();

            //5. Verify 'New User Signup!' is visible

           driver.findElement(By.xpath("//*[text()='New User Signup!']")).isDisplayed();

            //6. Enter name and email address

            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Damra");
            driver.findElement(By.xpath("//input[@data-qa='signup-email'][1]")).sendKeys("damragencC@gmail.com");

            //7. Click 'Signup' button

            driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();



            //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

            driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed();

            //9. Fill details: Title, Name, Email, Password, Date of birth

            driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");


         //9. Fill details: Title, Name, Email, Password, Date of birth

          WebElement gunDdm=  driver.findElement(By.xpath("//select[@data-qa='days']"));
            Select selectGun = new Select(gunDdm);
            selectGun.selectByIndex(25);

            WebElement month=driver.findElement(By.xpath("//select[@data-qa='months']"));
            Select selectMonth=new Select(month);
            selectMonth.selectByVisibleText("November");

            WebElement year=driver.findElement(By.xpath("//select[@data-qa='years']"));

            Select years=new Select(year);
            years.selectByVisibleText("1993");

            //10. Select checkbox 'Sign up for our newsletter!'

            driver.findElement(By.xpath("//input[@id='newsletter']")).click();

            //11. Select checkbox 'Receive special offers from our partners!'
            driver.findElement(By.xpath("//input[@id='optin']")).click();


            //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

            driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Damra");
            driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Genc");
            driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Dolce&Gabbana");
            driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Ege neighbourhood");
            driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Irmak site");

            WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
            Select Country=new Select(country);
            Country.selectByVisibleText("United States");

            driver.findElement(By.xpath("//input[@id='state']")).sendKeys("California");

            driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Los Angeles");
            driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("DGM");
            driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("5313269306");

            //13. Click 'Create Account button'

            driver.findElement(By.xpath("//*[text()='Create Account']")).click();

            //14. Verify that 'ACCOUNT CREATED!' is visible

            driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();

            driver.findElement(By.xpath("//*[text()='Congratulations! Your new account has been successfully created!']")).isDisplayed();

            //15. Click 'Continue' button

            driver.findElement(By.xpath("//*[text()='Continue']")).click();

           //16. Verify that 'Logged in as username' is visible

              driver.findElement(By.xpath(" //*[text()=' Logged in as '] ")).isDisplayed();


            //17. Click 'Delete Account' button

            driver.findElement(By.xpath("//*[@class='fa fa-trash-o']")).click();


            //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

            driver.findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed();

            driver.findElement(By.xpath("//*[text()='Continue']")).click();





            ReusableMethods.bekle(2);




















        }




}
