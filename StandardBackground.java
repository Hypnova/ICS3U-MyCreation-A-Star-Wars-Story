/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/14/14

 */

import java.awt.*;

import hsa.Console;

public class StandardBackground
{

    public static int[] [] stars = new int [75] [2];
    ;

    //global variable used to a
    private Console c;
    //class to make background
    public void drawBack ()
    {
	for (int i = 0 ; i < 640 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawRect (0, 0, 0 + i, 0 + i);
	}
	//Drawing the randomized stars
	//Random variable for star to be drawn for the fist scene background
	int i;
	for (i = 0 ; i < 75 ; i++)
	{
	    int x = 0 + (new Double (Math.random () * 640)).intValue ();
	    int y = 0 + (new Double (Math.random () * 500)).intValue ();
	    c.setColor (Color.white);
	    c.drawStar (x, y, 5 + i / 15, 5);
	    stars [i] [0] = x;
	    stars [i] [1] = y;
	}
    }


    public StandardBackground (Console con)
    {
	c = con;
	drawBack ();
    }
}


