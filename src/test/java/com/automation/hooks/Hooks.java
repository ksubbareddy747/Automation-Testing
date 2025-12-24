package com.automation.hooks;

import com.automation.base.BaseClass;
import com.automation.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private static boolean browserStarted = false;

    @Before
    public void setup() {

        if (!browserStarted) {
            ConfigReader.initProperties();
            String url = ConfigReader.getProperty("url");
            BaseClass.launchBrowser(url);
            browserStarted = true;
        }

        // 🔥 SAFETY: ensure we are logged in before each scenario
        if (!BaseClass.isUserLoggedIn()) {
            BaseClass.login();
        }
    }

    @After
    public void tearDown() {
        // ❌ DO NOT quit browser here
    }

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            BaseClass.quitBrowser();
        }));
    }
}
