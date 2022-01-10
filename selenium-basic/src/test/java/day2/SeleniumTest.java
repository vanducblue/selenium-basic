package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
   public static void main(String[] args){
       WebDriver driver = new ChromeDriver();

       driver.get("https://google.com");

       driver.getTitle(); // => "Google"

       WebElement searchBox = driver.findElement(By.name("q"));
       WebElement searchButton = driver.findElement(By.name("btnK"));

       searchBox.sendKeys("Selenium");
//       searchButton.click();
//
//       driver.findElement(By.name("q")).getAttribute("value"); // => "Selenium"

       driver.quit();
    }
}
