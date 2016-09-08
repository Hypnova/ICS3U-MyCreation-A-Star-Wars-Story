/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that draws a background for the fourth scene
   with the Death Star and the planet Korriban.
 */

import java.awt.*;

import hsa.Console;

public class BackgroundScene4
{
    //Instance variable declaration.
    private Console c;
    private Color bGray1 = new Color (135, 135, 135);
    private Color bGray2 = new Color (200, 200, 200);
    //Method to draw planets.
    public void drawBack ()
    {
	//Draws the Death Star.
	for (int i = 0 ; i < 100 ; i++)
	{
	    Color gradGray = new Color (70 + i, 70 + i, 70 + i);
	    c.setColor (gradGray);
	    c.drawOval (580 - i / 2, 60 - i / 2, i - 15, i - 15);

	}
	c.setColor (bGray1);
	c.fillOval (540, 30, 30, 30);
	c.setColor (bGray2);
	c.fillOval (545, 40, 10, 10);

	//Draws Korriban.
	for (int i = 0 ; i < 120 ; i++)
	{
	    Color gradRed = new Color (240, 16 + i, 16 + i);
	    c.setColor (gradRed);
	    c.drawOval (130 - i / 2, 90 - i / 2, i - 15, i - 15);
	    c.setColor (Color.cyan);
	    c.drawArc (55, 60 - i / 25, 140, 40, 135, 275);

	}


    }


    //Calling StandardBackground class to draw stars.
    public void runBack ()
    {
	StandardBackground b = new StandardBackground (c);

    }


    //Calling complete background scene.
    public BackgroundScene4 (Console con)
    {
	c = con;
	runBack ();
	drawBack ();
    }
}


