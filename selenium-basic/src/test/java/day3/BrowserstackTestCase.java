package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserstackTestCase {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/support");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement dev1 = driver.findElement(By.xpath("//*[@class='nav_item_name']"));
        dev1.click();
        WebElement document = driver.findElement(By.xpath("//a[contains(text(),'Documentation')]"));
        document.click();

        WebElement dev2 = driver.findElement(By.xpath("//*[@class='nav_item_name']"));
        dev2.click();
        WebElement support = driver.findElement(By.xpath("//a[contains(text(),'Support')]"));
        support.click();

        WebElement dev3 = driver.findElement(By.xpath("//*[@class='nav_item_name']"));
        dev3.click();
        WebElement status = driver.findElement(By.xpath("//a[contains(text(),'Status')]"));
        status.click();
        driver.navigate().back();

        WebElement dev4 = driver.findElement(By.xpath("//*[@class='nav_item_name']"));
        dev4.click();
        WebElement release = driver.findElement(By.xpath("//a[contains(text(),'Release Notes')]"));
        release.click();
        driver.navigate().back();

        WebElement dev5 = driver.findElement(By.xpath("//*[@class='nav_item_name']"));
        dev5.click();
        WebElement open = driver.findElement(By.xpath("//a[contains(text(),'Open Source')]"));
        open.click();
        driver.navigate().back();
        driver.close();

        driver.quit();
    }
}
