// Lab05Fst.java
// This is the student, starting version of Lab 05F which is divided into 8 cells.
// The first cell -- "Draw Red Horizontal Lines" -- is provided as an example.
// Students need to complete the other 7 cells on their own.

import java.awt.*;
import java.applet.*;

public class Lab05Fst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        int x1, y1, x2, y2, x, y, r;

        // Draw Red Horizontal Lines
        Expo.setColor(g,Expo.red);
        x1 = 0;
        y1 = 5;
        x2 = 250;
        y2 = 5;
        for (int j = 1; j <= 32; j++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            y1 += 10;
            y2 += 10;
        }


        // Draw Blue Vertical Lines
        Expo.setColor(g,Expo.blue);
        x1 = 260;
        y1 = 0;
        x2 = 260;
        y2 = 325;
        for (int v = 1; v<=24; v++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            x1 += 10;
            x2 +=10;
        } 


        // Draw Gray Diagonal Dots
        Expo.setColor(g,Expo.gray);
        x1 = 510;
        y1= 300;
        for (int d=1; d<=24; d++)
        {
            Expo.drawPoint(g,x1,y1);
            x1 += 10;
            y1 -= 10;
        }
        
        
        // Draw Green Concentric Circles
        Expo.setColor(g,Expo.green);
        x1 = 875;
        y1 = 163;
        r=10;
        for (int c=1; c<=12; c++)
        {
            Expo.drawCircle(g,x1,y1,r);
            r += 10;
        }
        

        // Draw Purple Concentric Ovals
        Expo.setColor(g,Expo.purple);
        x1 = 125;
        y1 = 488;
        int r1;
        int r2;
        r1=10;
        r2=30;
        for(int o=1; o<=14; o++)
        {
            Expo.drawOval(g,x1,y1,r1,r2);
            r1 += 7;
            r2 += 10;
        }



        // Draw Pink Concentric Arcs
        Expo.setColor(g,Expo.pink);
        x1 = 253;
        y1 = 650;
        r1 = 5;
        r2 = 15;
        int d1;
        int d2;
        d1 = 0;
        d2 = 90;
        for (int a=1; a<=30; a++)
        {
            Expo.drawArc(g,x1,y1,r1,r2,d1,d2);
            r1 += 8;
            r2 += 10;
        }
        




        // Draw Brown Concentric Rectangles
        Expo.setColor(g,Expo.brown);
        x1 = 615;
        y1 = 430;
        x2 = 640;
        y2 = 540;
        for (int e=1; e<=20; e++)
        {
            Expo.drawRectangle(g,x1,y1,x2,y2);
            x1 -=5;
            x2 +=5;
            y1 -= 5;
            y2 += 5;
        }



        // Draw Gold Sphere
        Expo.setColor(g,Expo.gold);




    




    }
}
