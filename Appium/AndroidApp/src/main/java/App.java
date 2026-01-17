import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class App {

    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setUdid("emulator-5554") // seu udid do adb devices
                .setAppPackage("com.android.settings")
                .setAppActivity("com.android.settings.Settings");

        AndroidDriver driver = new AndroidDriver(
                new URI("http://127.0.0.1:4723").toURL(),
                options
        );

        try {
            // Só pra você ver o XML da tela
            System.out.println(driver.getPageSource());

            // Exemplo: clicando em "Sistema" ou "System" (ajusta pro idioma do emulador)
            WebElement systemOption = driver.findElement(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"Apps\")")
                // ou: new UiSelector().text("System")
            );
            systemOption.click();

            System.out.println("Cliquei na opção de Sistema!");

        } finally {
            driver.quit();
        }
    }
}
