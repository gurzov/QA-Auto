package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyHelper {

    public static String getProperty(String propertyName) {
        InputStream input;
        Properties properties = new Properties();
        try {
            File file = new File(getPropertyFileName());
            input  = new FileInputStream(file);
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  properties.getProperty(propertyName);
    }

    private static String getPropertyFileName() {
        return System.getProperty("env"+".properties");
    }
}
