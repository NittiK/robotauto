package org.example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class bot0 {
    public static void clip(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }


    public static void main(String[] args) throws IOException, AWTException {
        Robot robot = new Robot();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("test");

        //Paint
        runtime.exec("mspaint.exe");
        robot.delay(1000);

        int xstart = 400;
        int ystart = 400;

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for (int k = 0; k < 100; k++) {
            int l = (int) (Math.random() * 200) + 150;
            int m = (int) (Math.random() * 200) + 150;

            robot.mouseMove(l, m);
            robot.delay(10);


        }

        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


        robot.mouseMove(xstart, ystart);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for (int k = 0; k < 100; k++) {
            robot.delay(10);
            robot.mouseMove(xstart + 500, ystart - 30);

            for (int j = 0; j < 4; j++) {
                robot.mouseMove(xstart++, ystart++);
            }

        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}