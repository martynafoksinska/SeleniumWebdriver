package wyszukiwanieElementu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("navbar-nav"));
        signIn.click();

        WebElement email1 = driver.findElement(By.id("email_create"));
        email1.sendKeys("99test@test.com");
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        WebElement lastName = driver.findElement(By.xpath("//*[@id='customer_lastname']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));

        if (firstName.isDisplayed()) {
            firstName.click();
            firstName.sendKeys("Jan");
        } else {
            System.out.println("Element is not displayed");
        }

        if (lastName.isDisplayed()) {
            lastName.click();
            lastName.sendKeys("Kowalski");
        } else {
            System.out.println("Element is not displayed");
        }

        if (email.isDisplayed()) {
            String emailText = email.getAttribute("Value");
            System.out.println(emailText);
            //email.click();
            //email.sendKeys("jkowalski@gmail.com");
        } else {
            System.out.println("Element is not displayed");
        }

        if (password.isDisplayed()) {
            password.click();
            password.sendKeys("654321");
        } else {
            System.out.println("Element is not displayed");
        }

        WebElement registerButton = driver.findElement(By.xpath("//*[@id='submitAccount']"));
        if (registerButton.isDisplayed()) {
            registerButton.click();
        } else {
            throw new IllegalStateException();
        }
    }
}