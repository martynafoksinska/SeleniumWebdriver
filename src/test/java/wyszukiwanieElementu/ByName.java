package wyszukiwanieElementu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
        WebElement searchRoomSubmit = driver.findElement(By.id("search_room_submit"));
        WebElement enterEmail = driver.findElement(By.id("newsletter-input"));

        hotelLocation.sendKeys("Warsaw");
        enterEmail.sendKeys("test@test.com");
        searchRoomSubmit.submit();

    }
}