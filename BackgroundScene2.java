/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that draws a background for the second scene
   with the planets Kashyyk and Tatooine.
 */

import java.awt.*;

import hsa.Console;

public class BackgroundScene2
{
    //Instance variable declaration.
    private Console c;
    //Method to draw planets.
    public void drawBack ()
    {
	//Draws Kashyyk.
	for (int i = 0 ; i < 120 ; i++)
	{
	    Color gradGreen = new Color (0, 255, 95 + i);
	    c.setColor (gradGreen);
	    c.drawOval (550 - i / 2, 100 - i / 2, i - 15, i - 15);
	    c.setColor (Color.white);
	    c.drawArc (475, 70 - i / 25, 140, 40, 135, 275);

	}


	//Draws Tatooine.
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
    public BackgroundScene2 (Console con)
    {
	c = con;
	runBack ();
	drawBack ();
    }
}


