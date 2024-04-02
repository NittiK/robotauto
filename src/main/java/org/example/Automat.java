package org.example;
import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Scanner;

public class Automat {
    public static void main(String[] args) throws InterruptedException, AWTException {
        EdgeDriverService service = new EdgeDriverService.Builder().withLogOutput(System.out).build();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement in = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea[1]"));
        in.sendKeys("dream world property");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
//        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("loop start");
        int count=0;
        for (int i = 0; i < 50; i++) {
            System.out.println("inside loop");
            List<WebElement> Iname = driver.findElements(By.xpath("//*[@class=\"yuRUbf\"]/div/span/a[1]/h3"));
            for (WebElement e: Iname) {
                System.out.println(e.getText());
                if (e.getText().contains("DreamWorld")) {
                    Robot robot = new Robot();
                    // Move mouse pointer to a specific position (x, y)
                    int x = e.getLocation().x + 150; // Adjust x-coordinate as needed
                    int y = e.getLocation().y + 120; // Adjust y-coordinate as needed
                    robot.mouseMove(x, y);
                    //e.click();
                    System.out.println("found dreamworld");
                    break;
                }
                //WebElement end = driver.findElement(By.xpath("*[@id=\"ofr\"]/i/a"));
                //System.out.println(end.getSize());
                List<WebElement> more = driver.findElements(By.xpath("//div[@class=\"GNJvt ipz2Oe\"]"));
                for (WebElement n : more){
                    System.out.println(n.isSelected() + " - " + count);
                    if (n.getText().contains("More results") && n.isDisplayed() && count > 15) {
                        //n.click();
                        System.out.println("more found");
                    }
                }
                action.sendKeys(Keys.PAGE_DOWN).build().perform();
                count++;
                Thread.sleep(2000);
            }
        }
        System.out.println("loop end");

//        System.out.println("start exit");
//        List<WebElement> more = driver.findElements(By.xpath("//div[@class=\"GNJvt ipz2Oe\"]"));
//        for (WebElement n : more){
//            if (n.getText().contains("More results")) {
//                    n.click();
//                System.out.println("more found");
//            }
//        }
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
//        action.sendKeys(Keys.PAGE_DOWN).build().perform();
//        List<WebElement> Iname = driver.findElements(By.xpath("//span[@class='VuuXrf']"));
//
//        for (WebElement a: Iname){
//            System.out.println((a.getText()));
//        }
//        System.out.println(Iname.stream().count());
    }
}
