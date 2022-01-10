package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuTC {
    public static void main(String[] args){
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement id = driver.findElement(By.name("user-name"));
        id.sendKeys("standard_user");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("secret_sauce");

        WebElement button_login = driver.findElement(By.xpath("//input[@id='login-button']"));
        button_login.click();
    }
}
