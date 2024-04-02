package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class bot1 {
    public static void clip(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }


    public static void main(String[] args) throws IOException, AWTException {
        Robot robot = new Robot();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("test");
        //copy&paste
        String [] text = new String [10];
        text[0] = "i:";
        text[1] = "clear";
        text[2] = "mkdir important";
        text[3] = "wget \"http://clipart-library.com/images/kiMKobxKT.jpg\" -outfile \"i:/important/wc.jpg\"";
        text[4] = "exit";
        text[5] = "i:\\important";

        text[6]= "https://www.youtube.com/watch?v=boAJUSN8fOU";
        robot.delay(2000);
        //Browser

        runtime.exec("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
        robot.delay(1000);

        //fullscreen
//        robot.keyPress(KeyEvent.VK_WINDOWS);nike


        //addressbar
//        robot.delay(800);
//        robot.keyPress(KeyEvent.VK_ALT);
//        robot.keyPress(KeyEvent.VK_E);
//        robot.keyRelease(KeyEvent.VK_ALT);
//        robot.keyRelease(KeyEvent.VK_E);

        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        //paste address
//        robot.delay(20000);
//        clip(text[6]);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_V);

        //enter
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        WebDriver driver = new ChromeDriver();


    }
}