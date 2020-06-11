import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class ChromeStandAloneGmailTest extends BaseTest {

    @Test
    public void test() throws MalformedURLException {

        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());

    }
}
