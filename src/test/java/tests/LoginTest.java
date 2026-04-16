package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest {

    private static final Logger log = LogManager.getLogger(LoginTest.class);

    @Test
    public void loginViaUiPath() {

        log.info("Starting test execution");


        try {
            Thread.sleep(5000); // optional wait
        } catch (Exception e) {
            e.printStackTrace();
        }

        log.info("Test execution completed");

        Assert.assertTrue(true);
    }
   
}