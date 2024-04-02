package org.example;
import java.awt.*;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

import static org.apache.commons.lang3.CharSetUtils.count;

public class auto {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.bing.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement s = driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]"));
        s.sendKeys("dream world property");
        wait.until(ExpectedConditions.visibilityOf(s));
        Actions a = new Actions(driver);
        a.sendKeys(Keys.ENTER).build().perform();
        List<WebElement> n = driver.findElements(By.xpath("//div[@class=\"tptt\"]"));
        for (WebElement e : n){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"tptt\"]")));
            if (e.getText().contains("dreamworld")) {
                Robot robot = new Robot();
                // Move mouse pointer to a specific position (x, y)
                int x = e.getLocation().x + 100; // Adjust x-coordinate as needed
                int y = e.getLocation().y + 120; // Adjust y-coordinate as needed

                //e.click();
                System.out.println("found dreamworld");
//                break;
            }
            else {
                Robot r = new Robot();
                r.mouseWheel(4);
            }
            System.out.println(e.getText());
            System.out.println(n.stream().count());
        }
    }
}
