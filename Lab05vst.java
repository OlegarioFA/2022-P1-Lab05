// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet {
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);


        for (int k = 0; k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            y2 -= 18;
            x1 += 28;
        }
        for (int k = 0; k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 18;
            x2 -= 28;
        }
        for (int k = 0; k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            y2 += 18;
            x1 -=28;
        }
        for (int k = 0; k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 18;
            x2 += 28;
        }
        //Extra Points
        int width2 = 500;
        int height2 = 300;
        int x3 = 250;
        int y3 = 475;
        int x4 = 750;
        int y4 = 475;
        g.drawRect(250, 175, width2, height2);

        for (int k = 0; k < 20; k++) {
            g.drawLine(x3, y3, x4, y4);
            y4 -= 15;
            x3 += 25;
        }
        for (int k = 0; k < 20; k++) {
            g.drawLine(x3, y3, x4, y4);
            y3 -= 15;
            x4 -= 25;
        }
        for (int k = 0; k < 20; k++) {
            g.drawLine(x3, y3, x4, y4);
            y4 += 15;
            x3 -=25;
        }
        for (int k = 0; k < 20; k++) {
            g.drawLine(x3, y3, x4, y4);
            y3 += 15;
            x4 += 25;
        }

    }
}

