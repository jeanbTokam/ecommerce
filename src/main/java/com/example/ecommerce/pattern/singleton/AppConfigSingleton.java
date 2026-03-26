package com.example.ecommerce.pattern.singleton;

/**
 * Singleton class for application-wide configuration
 * Example: store app name, version, or global settings
 */
public class AppConfigSingleton {

    // 1. Private static instance
    private static AppConfigSingleton instance;

    // 2. Private properties
    private String appName = "E-Commerce Order System";

    // 3. Private constructor to prevent direct instantiation
    private AppConfigSingleton() { }

    // 4. Public method to get the single instance (lazy initialization)
    public static AppConfigSingleton getInstance() {
        if (instance == null) {
            instance = new AppConfigSingleton();
        }
        return instance;
    }

    // 5. Getter and Setter
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}