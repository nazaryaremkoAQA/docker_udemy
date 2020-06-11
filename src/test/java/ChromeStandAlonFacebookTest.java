import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class ChromeStandAlonFacebookTest extends BaseTest {

    @Test
    public void test() throws MalformedURLException {
        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());

    }
}
