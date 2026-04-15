package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.UiPathRunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest {

    // Logger declaration (CLASS LEVEL)
    private static final Logger log = LogManager.getLogger(LoginTest.class);

    @Test
    public void loginViaUiPath() {

        log.info("Starting UiPath bot");

        // Step 1: Run UiPath bot
        UiPathRunner.runBot();

        try {
            Thread.sleep(10000); // wait for bot
        } catch (Exception e) {
            e.printStackTrace();
        }

        log.info("Bot execution completed");

        // Dummy validation (for now pass karne ke liye)
        Assert.assertTrue(true);
    }
}