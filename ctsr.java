package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class ctsr {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://my.ctrs.com.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        //Thread.sleep(3000);
        WebElement identity = driver.findElement(By.xpath("//input[@name='identity']"));
        identity.sendKeys("kenka@ukr.net");
        //Thread.sleep(3000);
        WebElement button_click = driver.findElement(By.xpath("//button[@class='icon-arrow']"));
        button_click.click();
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("12345678");
        //Thread.sleep(3000);
        WebElement go = driver.findElement(By.xpath("//input[@type='submit']"));
        go.click();

        WebElement text1 = driver.findElement(By.xpath("//figure[@class='profile-description']/figcaption"));
        Assert.assertTrue(text1.isDisplayed());

        System.out.println("My name is: "+text1.getText());

        driver.findElement(By.xpath("//*[@id=\"skeleton\"]/a/span")).click();




driver.quit();

}}
