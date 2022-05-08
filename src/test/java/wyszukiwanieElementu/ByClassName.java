package wyszukiwanieElementu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("navbar-nav"));
        signIn.click();

        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("test123123@test.com");
        Thread.sleep(3000);

        driver.findElement(By.name("SubmitCreate")).click();

    }
}
