package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StudentsTest {
    @Test
    public void createStudentTest() {
        System.setProperty("webdriver.chrome.driver"," /Users/liudmilaplucci/Desktop/chromedriver".trim());
        WebDriver driver = new ChromeDriver();
        driver.get("http://151.80.70.42:3000");

        driver.manage().window().maximize(); 

        driver.findElement(By.cssSelector("i.mdi-content-add")).click();
        driver.findElement(By.cssSelector("div.main-content #icon_prefix")).clear();
        driver.findElement(By.cssSelector("div.main-content #icon_prefix")).sendKeys("VASILYSA");
        driver.findElement(By.cssSelector("div.main-content #icon_telephone")).clear();
        driver.findElement(By.cssSelector("div.main-content #icon_telephone")).sendKeys("123456");
        driver.findElement(By.cssSelector("div.main-content a.safe-btn")).click();









    }
}
