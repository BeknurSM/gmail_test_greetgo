package com.gmail.ui.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesHandler {

    private static final Properties properties = new Properties();

    static {
        try (FileInputStream inputStream = new FileInputStream("src/test/resources/properties/config.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getTestData(String key) {
        return Objects.requireNonNull(properties.getProperty(key), "The property value is null");
    }

    private static final String browser = getTestData("browser");
    private static final String loginPage = getTestData("loginPage");
    private static final String userLogin = getTestData("user.email");
    private static final String userPassword = getTestData("user.password");
    public static final long baseTimeout = Long.parseLong(getTestData("baseTimeout"));

    public static String getBrowser() {
        return browser;
    }
    public static String getLoginPage() {
        return loginPage;
    }

    public static String getUserLogin() {

        return userLogin;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static Long getBaseTimeout() {
        return baseTimeout;
    }
}
