import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class EmailAndSitingsPage {
    private AndroidDriver driver;

    String goToMail = "ru.yandex.mail:id/go_to_mail_button";
    String menu = "//android.widget.ImageButton[@content-desc=\"Открыть меню\"]";
    String sending = "//android.widget.RelativeLayout[@content-desc=\"Папка Отправленные, 0 непрочитанных\"]";
    String incomong = "//android.widget.RelativeLayout[@content-desc=\"Папка Входящие, 4 непрочитанных\"]/android.widget.TextView";
    String back = "//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]";
    String exit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[15]/android.widget.RelativeLayout";

    public EmailAndSitingsPage(AndroidDriver androidDriver)
    {
        this.driver = androidDriver;
    }

    public MobileElement clickMail()
    {
        MobileElement el1 = (MobileElement) driver.findElementById(goToMail);
        return el1;
    }

    public MobileElement clickMenu()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath(menu);
        return el1;
    }

    public MobileElement clickIncomingMail()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath(incomong);
        return el1;
    }

    public MobileElement clickSendingMail()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath(sending);
        return el1;
    }

    public MobileElement clickBack()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath(back);
        return el1;
    }

    public MobileElement clickExit()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath(exit);
        return el1;
    }
}
