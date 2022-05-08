package wyszukiwanieElementu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingPages {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(2000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(2000);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        Thread.sleep(2000);

        driver.quit();
    }
}