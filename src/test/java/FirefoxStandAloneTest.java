import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxStandAloneTest {

    @Test
    public void test() throws MalformedURLException {

        URL url = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities cab = DesiredCapabilities.firefox();
        RemoteWebDriver driver = new RemoteWebDriver(url, cab);
        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }
}
