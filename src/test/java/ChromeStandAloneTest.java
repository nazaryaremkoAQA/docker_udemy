import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class ChromeStandAloneTest extends BaseTest {

    @Test
    public void test() throws MalformedURLException {

        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }
}
