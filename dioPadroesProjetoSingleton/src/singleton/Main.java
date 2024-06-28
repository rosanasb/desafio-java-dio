package singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        configManager.setConfig("url", "http://localhost:8080");
        configManager.setConfig("username", "admin");
        configManager.setConfig("password", "admin123");

        System.out.println("URL: " + configManager.getConfig("url"));
        System.out.println("Username: " + configManager.getConfig("username"));
        System.out.println("Password: " + configManager.getConfig("password"));

        // Verify Singleton behavior
        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        System.out.println("URL from another instance: " + anotherConfigManager.getConfig("url"));
    }
}
