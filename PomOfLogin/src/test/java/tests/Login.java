package tests;

import Pages.SignIn;
import Pages.HomePage;
import Pages.ForgetPassPage;
import Pages.ResetPassPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

public class Login {
    WebDriver driver;
    SignIn s;
    HomePage hp;
    ForgetPassPage fp;
    ResetPassPage rp;

    @BeforeClass
    public void initialize() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }

    @Test
    public void loginTest() throws InterruptedException {
        s = new SignIn(driver);
        String myuser = s.Login("Amira", "123");

        fp = new ForgetPassPage(driver);
        fp.forgetMyPass("Amira", "amira@gmail", "01015524671");

        rp = new ResetPassPage(driver);
        String TempPassword= rp.getMessage();
        String myuser_2= s.Login(myuser, TempPassword);
        hp = new HomePage(driver);

        Assert.assertEquals(hp.isLogoutButtonDisplayed(),true,"first assertion");
        Assert.assertEquals(hp.myTestisdisplayed(), true,"secand assration");
        //Assert.assertEquals("Hello"+ myuser +",",hp.hellouserIsdisPlayed(),"third assertion");
       // Assert.assertEquals("Hello"+ myuser +",", hp.hellouserIsdisPlayed(),"third assertion");
        Assert.assertTrue(hp.hellouserIsdisPlayed().contains(myuser), "third assertion");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
