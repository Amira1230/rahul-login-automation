package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassPage {
    WebDriver driver;

    // Constructor to initialize the WebDriver
    public ResetPassPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Apply implicit wait

    }

    // Elements
    By message= By.className("infoMsg");
    By Gotologin= By.className("go-to-login-btn");

    // Actions
        public String getMessage() throws InterruptedException {
            // Wait for the message to be displayed
            Thread.sleep(2000); // Adjust the sleep time as needed
           String allcontent = driver.findElement(message).getText();
           //split mess to take pass
            String Passcontent = allcontent.split("'")[1].split("'")[0];

            driver.findElement(Gotologin).click();
            Thread.sleep(1000);
            return Passcontent;


        }

}
