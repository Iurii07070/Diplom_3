package praktikum;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConfig {
    public static final long WAIT_SEC_TIMEOUT = 10;

    @Step("setDriver")
    public static WebDriver setDriver() {
        String browserType = System.getProperty("browser", "chrome").toLowerCase();

        switch (browserType) {
            case "chrome":
                return setupChromeDriver();
            case "firefox":
                return setupFirefoxDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }

    private static WebDriver setupChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }

    private static WebDriver setupFirefoxDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/firefox");
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(firefoxOptions);
    }
}
