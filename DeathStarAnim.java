/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that draws and animates the Death Star in scene
   2. The animation also includes the laser that is shot at Alderaan and the
   explosion
 */
import java.awt.*;
import hsa.Console;

public class DeathStarAnim extends Thread
{

    private Console c;
    //Death Star Colors
    Color bGray1 = new Color (71, 71, 71);
    Color bGray2 = new Color (135, 135, 135);
    Color bGray3 = new Color (200, 200, 200);
    Color rGreen1 = new Color (135, 255, 0);
    public void drawDeathStar ()
    {
	//Alderaan
	for (int i = 0 ; i < 140 ; i++)
	{
	    Color gradBlue = new Color (0, 25 + i, 255);
	    c.setColor (gradBlue);
	    c.drawOval (70 - i / 2, 230 - i / 2, i, i);
	}

	for (int i = 0 ; i < 360 ; i++)
	{
	    //Erase
	    c.setColor (Color.black);
	    c.fillRect (705 - i, 540 - i, 250, 450);
	    for (int f = 0 ; f < 75 ; f++)
	    {
		//Star Redraw
		c.setColor (Color.white);
		if (StandardBackground.stars [f] [0] < 5 + i && StandardBackground.stars [f] [1] < 10 + i &&
			StandardBackground.stars [f] [0] + 5 < i + 5 && StandardBackground.stars [f] [1] + 5 < 10 + i + 5)
		    c.setColor (Color.white);
		c.drawStar (StandardBackground.stars [f] [0], StandardBackground.stars [f] [1], 5 + f / 40, 5);

	    }


	    //Outer circle
	    c.setColor (bGray3);
	    c.fillOval (750 - i, 500 - i, 200, 200);
	    //Inner cirlce
	    c.setColor (bGray1);
	    c.fillOval (752 - i, 550 - i, 40, 100);
	    //Rays
	    c.setColor (rGreen1);
	    c.drawLine (772 - i, 550 - i, 710 - i, 600 - i);
	    c.drawLine (772 - i, 650 - i, 710 - i, 600 - i);
	    c.drawLine (790 - i, 600 - i, 710 - i, 600 - i);
	    //Patterns on Death Star
	    c.setColor (Color.black);
	    c.drawArc (800 - i, 500 - i, 100, 200, -90, 180);
	    c.drawArc (735 - i, 535 - i, 75, 125, -90, 180);
	    c.drawArc (785 - i, 535 - i, 155, 50, 200, 160);
	    c.drawArc (780 - i, 615 - i, 160, 50, 190, 170);
	    //Other Patterns on Death Star
	    c.setColor (Color.red);
	    c.fillRect (790 - i, 650 - i, 5, 5);
	    c.fillRect (885 - i, 660 - i, 5, 5);
	    c.fillRect (810 - i, 575 - i, 5, 5);
	    c.fillRect (895 - i, 580 - i, 5, 5);
	    try
	    {
		sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	    c.update ();
	}
	//Laser
	for (int j = 0 ; j < 30 ; j++)
	{
	    c.setColor (rGreen1);
	    c.fillOval (415 - j / 2, 240 - j / 2, j, j);
	    c.drawLine (420 - j, 240, 420 - j * 3, 240);
	    try
	    {
		sleep (50);
	    }
	    catch (Exception e)
	    {
	    }
	    c.setColor (rGreen1);
	    c.drawLine (430, 241, 400, 241);

	    c.update ();
	}
	c.setColor (Color.black);
	c.drawLine (390, 240, 330, 240);
	for (int i = 0 ; i < 50 ; i++)
	{
	    c.setColor (rGreen1);
	    c.drawLine (330 - i * 4, 240, 330 - i * 4, 240);
	    try
	    {
		sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	    c.update ();
	}
	//Explosion
	for (int j = 0 ; j < 1300 ; j++)
	{
	    c.setColor (Color.red);
	    c.fillOval (15 - j / 2, 240 - j / 2, j, j);
	    c.setColor (Color.orange);
	    c.fillOval (65 - j / 2, 280 - j / 2, j, j);
	    c.setColor (bGray2);
	    c.fillOval (65 - j / 2, 200 - j / 2, j, j);
	    c.setColor (bGray1);
	    c.fillOval (115 - j / 2, 240 - j / 2, j, j);
	    c.setColor (bGray3);
	    c.fillOval (65 - j / 2, 240 - j / 2, j, j);
	    try
	    {
		sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	    c.update ();
	}
    }


    public DeathStarAnim (Console con)
    {
	c = con;

    }


    public void run ()
    {
	drawDeathStar ();
    }
}
