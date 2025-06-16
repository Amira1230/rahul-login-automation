package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class ForgetPassPage {
        WebDriver driver;


        // Constructor to initialize the WebDriver
    public ForgetPassPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Apply implicit wait
    }
    //elements
    By NameField = By.xpath("//input[@placeholder='Name']");
    By EmailField = By.xpath("//input[@placeholder='Email']");
    By PhoneField = By.xpath("//input[@placeholder='Phone Number']");
    By resetlogin=By.className("reset-pwd-btn");
    By BackToLogin=By.className("go-to-login-btn");


    // Actions
    public void forgetMyPass(String name, String email, String phone) {
        driver.findElement(NameField).sendKeys(name);
        driver.findElement(EmailField).sendKeys(email);
        driver.findElement(PhoneField).sendKeys(phone);
        driver.findElement(resetlogin).click();
    }

    // Actions
}
