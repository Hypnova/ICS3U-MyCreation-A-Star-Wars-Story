/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that draws a background for the third scene
   witht the Death Star, the planet Kashyyk, and the planet Tatooine.
 */
import java.awt.*;

import hsa.Console;

public class BackgroundScene3
{
    //Instance Variable Declaration.
    private Console c;
    private Color bGray1 = new Color (135, 135, 135);
    private Color bGray2 = new Color (200, 200, 200);
    //Method to draw background planets.
    public void drawBack ()
    {
	//Draws Death Star
	for (int i = 0 ; i < 180 ; i++)
	{
	    Color gradGray = new Color (70 + i, 70 + i, 70 + i);
	    c.setColor (gradGray);
	    c.drawOval (590 - i / 2, 450 - i / 2, i - 15, i - 15);

	}
	c.setColor (bGray1);
	c.fillOval (530, 380, 50, 50);
	c.setColor (bGray2);
	c.fillOval (545, 390, 20, 20);
	//Draws the planet Kashyyk.
	for (int i = 0 ; i < 120 ; i++)
	{
	    Color gradGreen = new Color (0, 255, 95 + i);
	    c.setColor (gradGreen);
	    c.drawOval (350 - i / 2, 420 - i / 2, i - 15, i - 15);
	    c.setColor (Color.white);
	    c.drawArc (275, 390 - i / 25, 140, 40, 135, 275);

	}

	//Draws the planet Tatooine.
	for (int i = 0 ; i < 50 ; i++)
	{
	    Color gradOrange = new Color (255, 205 + i, 0);
	    c.setColor (gradOrange);
	    c.drawOval (50 - i / 2, 420 - i / 2, i, i);
	}

    }


    //Calling StandardBackground class to draw stars.
    public void runBack ()
    {
	StandardBackground a = new StandardBackground (c);

    }


    //Calling complete background scene.
    public BackgroundScene3 (Console con)
    {
	c = con;
	runBack ();
	drawBack ();
    }
}


