package wyszukiwanieElementu;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pl.wikipedia.org/");

        WebElement search = driver.findElement(By.id("searchInput"));
        if(search.isDisplayed()) {
            search.sendKeys("Selenium");
            search.submit();
        }else {
            System.out.println("nothing");
        }
        driver.close();
    }
}