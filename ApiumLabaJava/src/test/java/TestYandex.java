import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.sleep;

public class TestYandex {
    private AndroidDriver driver;


    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "asus ZE520KL");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("platformVersion", "8.0");
        desiredCapabilities.setCapability("udid", "GAAZCY03P419B35");
        desiredCapabilities.setCapability("appPackage", "ru.yandex.mail");
        desiredCapabilities.setCapability("appActivity", "ru.yandex.mail.ui.LoginActivity");

        URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnMail();
        loginPage.setLogin("testselenid3@yandex.ru");
        loginPage.clickOnNext();
        loginPage.setPassword("O9cYe41vaxt2)");
        loginPage.clickOnNext();
    }

    @Test
    public void emailTest()
    {
        EmailAndSitingsPage emailAndSitingsPage = new EmailAndSitingsPage(driver);
        sleep(8500);

        emailAndSitingsPage.clickMail().click();
        emailAndSitingsPage.clickMenu().click();
        sleep(4000);

        emailAndSitingsPage.clickIncomingMail().click();
        sleep(4000);

        emailAndSitingsPage.clickMenu().click();
        sleep(4000);

        emailAndSitingsPage.clickSendingMail().click();
        sleep(4000);

        driver.swipe(0,700,1000,780,300);
        sleep(4000);
        driver.swipe(560,1460,630,410,410);
        sleep(4000);
        driver.tap(1,360,1508,100);
        sleep(4000);
        driver.tap(1,960,900,100);
        sleep(4000);
        driver.tap(1,960,900,100);
        sleep(4000);

        emailAndSitingsPage.clickBack().click();
        sleep(4000);
        emailAndSitingsPage.clickExit().click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}