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
        return properties.getProperty(key);
    }
}