package wyszukiwanieElementu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.quit();
    }
}