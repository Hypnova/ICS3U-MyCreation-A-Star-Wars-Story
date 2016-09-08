/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that draws and animates the Imperial star Destroyer
   in the first scene of the animation.
 */

import java.awt.*;
import hsa.Console;
public class ImperialStarDestroyer implements Runnable 
{
    private Console c;

    public void drawStarDestroyer ()
    {
	Color darkestGray = new Color (90, 90, 90);
	Color darkGray = new Color (135, 135, 135);
	Color lightGray = new Color (200, 200, 200);
	Color lightestGray = new Color (225, 225, 225);

	for (int q = 0 ; q < 480 ; q++)
	{
	       c.setColor (Color.black);
	    c.fillRect (5 + q, 10 + q, 340, 295);
	    //Star Redraw
	    for (int f = 0 ; f < 75 ; f++)
	    {
		c.setColor (Color.white);
		if (StandardBackground.stars [f] [0] < 5 + q && StandardBackground.stars [f] [1] < 10 + q &&
			StandardBackground.stars [f] [0] + 5 < q + 5 && StandardBackground.stars [f] [1] + 5 < 10 + q + 5)
		    c.setColor (Color.white);
		c.drawStar (StandardBackground.stars [f] [0], StandardBackground.stars [f] [1], 5 + f / 40, 5);

	    }
	    //Bottom Rect
	    int[] bottomStarDestX = new int [4];
	    bottomStarDestX [0] = 5 + q;
	    bottomStarDestX [1] = 20 + q;
	    bottomStarDestX [2] = 220 + q;
	    bottomStarDestX [3] = 205 + q;

	    int[] bottomStarDestY = new int [4];
	    bottomStarDestY [0] = 210 + q;
	    bottomStarDestY [1] = 190 + q;
	    bottomStarDestY [2] = 285 + q;
	    bottomStarDestY [3] = 305 + q;

	    c.setColor (lightGray);
	    c.fillPolygon (bottomStarDestX, bottomStarDestY, 4);

	    //Mid Triangle
	    int[] midTriagX = new int [3];
	    midTriagX [0] = 205 + q;
	    midTriagX [1] = 230 + q;
	    midTriagX [2] = 220 + q;

	    int[] midTriagY = new int [3];
	    midTriagY [0] = 305 + q;
	    midTriagY [1] = 305 + q;
	    midTriagY [2] = 285 + q;

	    c.setColor (lightestGray);
	    c.fillPolygon (midTriagX, midTriagY, 3);

	    //Bottom Rect Right
	    int[] bottomStarDestRightX = new int [4];
	    bottomStarDestRightX [0] = 215 + q;
	    bottomStarDestRightX [1] = 230 + q;
	    bottomStarDestRightX [2] = 345 + q;
	    bottomStarDestRightX [3] = 340 + q;

	    int[] bottomStarDestRightY = new int [4];
	    bottomStarDestRightY [0] = 285 + q;
	    bottomStarDestRightY [1] = 305 + q;
	    bottomStarDestRightY [2] = 235 + q;
	    bottomStarDestRightY [3] = 215 + q;

	    c.setColor (lightestGray);
	    c.fillPolygon (bottomStarDestRightX, bottomStarDestRightY, 4);

	    // Right body triangle
	    int[] bodyTriagRightX = new int [3];
	    bodyTriagRightX [0] = 150 + q;
	    bodyTriagRightX [1] = 20 + q;
	    bodyTriagRightX [2] = 220 + q;

	    int[] bodyTriagRightY = new int [3];
	    bodyTriagRightY [0] = 120 + q;
	    bodyTriagRightY [1] = 190 + q;
	    bodyTriagRightY [2] = 285 + q;

	    c.setColor (darkGray);
	    c.fillPolygon (bodyTriagRightX, bodyTriagRightY, 3);

	    // Right body triangle
	    int[] bodyTriagLeftX = new int [3];
	    bodyTriagLeftX [0] = 150 + q;
	    bodyTriagLeftX [1] = 340 + q;
	    bodyTriagLeftX [2] = 220 + q;

	    int[] bodyTriagLeftY = new int [3];
	    bodyTriagLeftY [0] = 120 + q;
	    bodyTriagLeftY [1] = 215 + q;
	    bodyTriagLeftY [2] = 285 + q;

	    c.setColor (lightGray);
	    c.fillPolygon (bodyTriagLeftX, bodyTriagLeftY, 3);

	    //Left Trapezoid
	    int[] leftStarDestX = new int [4];
	    leftStarDestX [0] = 60 + q;
	    leftStarDestX [1] = 170 + q;
	    leftStarDestX [2] = 135 + q;
	    leftStarDestX [3] = 95 + q;

	    int[] leftStarDestY = new int [4];
	    leftStarDestY [0] = 170 + q;
	    leftStarDestY [1] = 170 + q;
	    leftStarDestY [2] = 110 + q;
	    leftStarDestY [3] = 110 + q;

	    c.setColor (darkestGray);
	    c.fillPolygon (leftStarDestX, leftStarDestY, 4);
	    //Right paralellogram
	    int[] rightStarDestX = new int [4];
	    rightStarDestX [0] = 170 + q;
	    rightStarDestX [1] = 245 + q;
	    rightStarDestX [2] = 200 + q;
	    rightStarDestX [3] = 135 + q;

	    int[] rightStarDestY = new int [4];
	    rightStarDestY [0] = 170 + q;
	    rightStarDestY [1] = 170 + q;
	    rightStarDestY [2] = 110 + q;
	    rightStarDestY [3] = 110 + q;

	    c.setColor (lightestGray);
	    c.fillPolygon (rightStarDestX, rightStarDestY, 4);

	    //mid rect
	    c.setColor (darkestGray);
	    c.fillRect (130 + q, 70 + q, 40, 40);

	    //top hex
	    //Bottom Rect Right
	    int[] hexStarDestRightX = new int [6];
	    hexStarDestRightX [0] = 90 + q;
	    hexStarDestRightX [1] = 205 + q;
	    hexStarDestRightX [2] = 215 + q;
	    hexStarDestRightX [3] = 205 + q;
	    hexStarDestRightX [4] = 90 + q;
	    hexStarDestRightX [5] = 80 + q;


	    int[] hexStarDestRightY = new int [6];
	    hexStarDestRightY [0] = 90 + q;
	    hexStarDestRightY [1] = 90 + q;
	    hexStarDestRightY [2] = 75 + q;
	    hexStarDestRightY [3] = 60 + q;
	    hexStarDestRightY [4] = 60 + q;
	    hexStarDestRightY [5] = 75 + q;

	    c.setColor (lightestGray);
	    c.fillPolygon (hexStarDestRightX, hexStarDestRightY, 6);

	    // circles and rectangles at top
	    c.setColor (darkGray);
	    c.fillRect (110 + q, 50 + q, 20, 10);
	    c.fillRect (165 + q, 50 + q, 20, 10);
	    c.setColor (lightGray);
	    c.fillOval (105 + q, 25 + q, 30, 30);
	    c.fillOval (160 + q, 25 + q, 30, 30);
	    //Writing my name
	    c.drawString ("Siavash Samiei", 70 + q, 170 + q);
	    //Delay
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
     
	    c.update ();
	}
    }



    public ImperialStarDestroyer (Console con)
    {
	c = con;

    }


    public void run ()
    {

	drawStarDestroyer ();
    }
}
