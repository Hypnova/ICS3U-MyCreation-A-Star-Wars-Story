/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that draws a background for the first scene
   with a Death Star and the planet Alderaan.
 */

import java.awt.*;

import hsa.Console;

public class LaserExplosion extends Thread
{
    private Console c;
    public void drawLaser ()
    {
	for (int i = 0 ; i < 75 ; i++)
	{
	    for (int f = 0 ; f < 75 ; f++)
	    {
		c.setColor (Color.white);

		if (StandardBackground.stars [f] [0] < 5 + i
			&& StandardBackground.stars [f] [1] < 10 + i &&
			StandardBackground.stars [f] [0] + 5 < i + 5 && StandardBackground.stars [f] [1] + 5 < 10 + i + 5)
		    c.setColor (Color.white);
		c.drawStar (StandardBackground.stars [f] [0], StandardBackground.stars [f] [1], 5 + f / 40, 5);

	    }
	    //Erase
	    c.setColor (Color.black);
	    c.drawLine (225 + i, 300, 300 + i, 300);
	    c.setColor (Color.red);
	    c.drawLine ((300 + i), 300, (300 + i) + i, 300);
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {

	    }
	    c.update ();
	}
	for (int j = 0 ; j < 1300 ; j++)
	{
	    c.setColor (Color.red);
	    c.fillOval (500 - j / 2, 240 - j / 2, j, j);
	    c.setColor (Color.orange);
	    c.fillOval (550 - j / 2, 280 - j / 2, j, j);
	    c.setColor (Color.yellow);
	    c.fillOval (550 - j / 2, 200 - j / 2, j, j);
	    c.setColor (Color.gray);
	    c.fillOval (600 - j / 2, 240 - j / 2, j, j);
	    c.setColor (Color.darkGray);
	    c.fillOval (550 - j / 2, 240 - j / 2, j, j);
	    try
	    {
		sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	    c.update ();
	}
    }





    public LaserExplosion (Console con)
    {
	c = con;

    }


    public void run ()
    {
	drawLaser ();
    }
}





