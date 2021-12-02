import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private AndroidDriver driver;

    String loginElement = "ru.yandex.mail:id/edit_login";
    String passwordElement = "ru.yandex.mail:id/edit_password";
    String nextButton = "ru.yandex.mail:id/button_next";
    String mailButton = "ru.yandex.mail:id/list_yandex";


    public LoginPage(AndroidDriver driver)
    {
        this.driver = driver;
    }

    public void setLogin(String login)
    {
        MobileElement el = (MobileElement) driver.findElementById(loginElement);
        //"testselenid3@yandex.ru"
        el.sendKeys(login);
    }

    public void setPassword(String password)
    {
        MobileElement el4 = (MobileElement) driver.findElementById(passwordElement);
        //"O9cYe41vaxt2)"
        el4.setValue(password);
    }

    public void clickOnNext()
    {
        MobileElement el3 = (MobileElement) driver.findElementById(nextButton);
        el3.click();
    }

    public void clickOnMail()
    {
        MobileElement el1 = (MobileElement) driver.findElementById(mailButton);
        el1.click();
        sleep(1000);
    }
}
