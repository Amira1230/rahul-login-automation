package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By logoutButton = By.className("logout-btn");
    By rahol = By.xpath("//strong[normalize-space(text())='Rahul Shetty']");
    By hellouser = By.xpath("//*[@id=\"root\"]/div/div/div/h2");

    public boolean isLogoutButtonDisplayed() {
        boolean result=driver.findElement(logoutButton).isDisplayed();
        return result;

    }

    public boolean myTestisdisplayed() {
        boolean result = driver.findElement(rahol).isDisplayed();
        return result;

    }



    public String hellouserIsdisPlayed() {
        String user = driver.findElement(hellouser).getText();
        return user;

    }
}
