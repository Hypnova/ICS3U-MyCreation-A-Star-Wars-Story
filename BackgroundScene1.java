/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that draws a background for the first scene
   with a Death Star and the planet Alderaan.
 */

import java.awt.*;

import hsa.Console;

public class BackgroundScene1
{
    //Instance variable declaration.
    private Console c;
    private Color bGray1 = new Color (135, 135, 135);
    private Color bGray2 = new Color (200, 200, 200);
    //Method to make background
    public void drawBack ()
    {
	//Draws Death Star
	for (int i = 0 ; i < 180 ; i++)
	{
	    Color gradGray = new Color (70 + i, 70 + i, 70 + i);
	    c.setColor (gradGray);
	    c.drawOval (550 - i / 2, 100 - i / 2, i - 15, i - 15);

	}
	c.setColor (bGray1);
	c.fillOval (490, 30, 50, 50);
	c.setColor (bGray2);
	c.fillOval (505, 40, 20, 20);


	//Draws Alderaan
	for (int i = 0 ; i < 90 ; i++)
	{
	    Color gradBlue = new Color (0, 25 + i, 255);
	    c.setColor (gradBlue);
	    c.drawOval (50 - i / 2, 420 - i / 2, i, i);
	}

    }


    //Calls the StandardBackground class to draw the stars of the background.
    public void runBack ()
    {
	StandardBackground a = new StandardBackground (c);

    }


    //Calling full background scene.
    public BackgroundScene1 (Console con)
    {
	c = con;
	runBack ();
	drawBack ();
    }
}



