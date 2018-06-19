package com.agapovp.epam.fundamentals.ht5.ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
    private Properties properties;

    public PropertyClass(String fileName) {
        properties = new Properties();

        try(FileInputStream inputStream = new FileInputStream(fileName)) {

            properties.load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) throws PropertyNoSuchKeyException {
        String property = properties.getProperty(key);
        if (property == null) {
            throw new PropertyNoSuchKeyException("No such key: ", key);
        } else return property;
    }
}
