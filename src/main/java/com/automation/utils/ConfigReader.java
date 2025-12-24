package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    // Load config.properties
    public static void initProperties() {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream("C:/backup/Subba Reddy K/Desktop/subbareddy_workspace/HomZera/config.properties");
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get value from config.properties
    public static String getProperty(String key) {
        if (properties == null) {
            initProperties();
        }
        return properties.getProperty(key);
    }
}

