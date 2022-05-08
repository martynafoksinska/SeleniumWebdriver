package wyszukiwanieElementu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("navbar-nav"));
        signIn.click();

        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("8test@test.com");
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        firstName.sendKeys("Jan");

        WebElement lastName = driver.findElement(By.xpath("//*[@id='customer_lastname']"));
        lastName.sendKeys("Kowalski");

        WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
        password.sendKeys("54321");

        driver.findElement(By.xpath("//*[@id='days']/option[3]")).click();
        driver.findElement(By.xpath("//*[@id='months']/option[5]")).click();
        driver.findElement(By.xpath("//*[@id='years']/option[2]")).click();
        driver.findElement(By.xpath("//*[@id='newsletter']")).click();
        driver.findElement(By.xpath("//*[@id='optin']")).click();


        WebElement registerButton = driver.findElement(By.xpath("//*[@id='submitAccount']/span"));
        registerButton.click();

        //driver.findElement(By.cssSelector(("#center_column > div > div > ul > li:nth-child(5) > a > span")));
        //driver.findElement(By.cssSelector(("#center_column > div > div > ul > li:nth-child(4) > a > span")));

        driver.findElement(By.cssSelector("[title=Information]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.cssSelector("[title=Addresses]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
    }
}