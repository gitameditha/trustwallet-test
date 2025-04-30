package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocatorUtils {
    private Properties properties;

    // Constructor to load a specific properties file
    public LocatorUtils(String fileName) {
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/" + fileName)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load locator file: " + fileName);
        }
    }

    // Method to get a locator by key
    public String getLocator(String key) {
        String locator = properties.getProperty(key);
        if (locator == null) {
            throw new IllegalArgumentException("Locator not found for key: " + key);
        }
        return locator;
    }

    public String getDynamicLocator(String key, String replacement) {
        String locator = getLocator(key);
        if (locator == null) {
            throw new IllegalArgumentException("Locator not found for key: " + key);
        }
        return locator.replace("{dynamicText}", replacement);
    }
}