package syntax.class03Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/");

        driver.manage().window().maximize();
        WebElement startPracticing = driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPracticing.click();
        WebElement simpleDemo = driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']"));
        simpleDemo.click();








    }

}
