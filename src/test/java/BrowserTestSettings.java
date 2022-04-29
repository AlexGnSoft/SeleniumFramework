import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTestSettings {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");   // Shows you your project current location
        System.out.println("projectPath: " + projectPath);

//        System.setProperty("webdriver.gecko.driver", projectPath + "//src/main/resources/geckodriver"); // Showed absolute the relative path
//        WebDriver driver = new FirefoxDriver();


        System.setProperty("webdriver.chrome.driver", projectPath + "//src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

        driver.close();
    }
}
