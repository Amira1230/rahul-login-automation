package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    WebDriver driver ;
    public SignIn(WebDriver driver) {
        this.driver = driver;
    }
    //elements
    By Username= By.id("inputUsername");
    By Password= By.name("inputPassword");
    By RememberMe=By.xpath("//input[@type='checkbox']");
    By AccaptTerms=By.xpath("//input[@value='agreeTerms']");
    By forgotPass=By.linkText("Forgot your password?");
    By Submit=By.cssSelector("button[type='submit']");


    //actions
    public String Login(String user, String pass) throws InterruptedException {
        driver.findElement(Username).sendKeys(user);
        String Myuser= driver.findElement(Username).getAttribute("value");
        driver.findElement(Password).sendKeys(pass);
        driver.findElement(RememberMe).click();
        driver.findElement(AccaptTerms).click();
        driver.findElement(forgotPass).click();
        driver.findElement(Submit).click();
        return Myuser;

    }


}
