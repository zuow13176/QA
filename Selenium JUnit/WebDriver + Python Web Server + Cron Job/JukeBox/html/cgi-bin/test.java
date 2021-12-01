package Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Translate {
    WebDriver driver;
    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("https://translate.google.com/u/5/?hl=en&tab=wT&sl=en&tl=zh-CN&text=Hello%0A&op=translate");
            translate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void translate() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id=\"tw-sl\"]/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id=\"tw-container\"]/g-expandable-container/" +
            "div/div/div[6]/g-expandable-container/div/g-expandable-content/" +
            "span/div/div[3]/div[1]/div/div[3]/div[23]")).click();
        driver.findElement(By.xpath("//*[@id=\"tw-tl\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"tw-container\"]/g-expandable-container" +
            "/div/div/div[6]/g-expandable-container/div/g-expandable-content" +
            "/span/div/div[2]/div[1]/div/div[2]/div[96]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"tw-source-text-ta\"]")).sendKeys("Hello");
        Thread.sleep(3000);
        String result = driver.findElement(By.xpath("//*[@id=\"tw-target-text\"]/span")).getText();
        System.out.println(" The Result is " + result);
    }
    public static void main(String[] args) {
        Translate test = new Translate();
        test.invokeBrowser();
    }
}