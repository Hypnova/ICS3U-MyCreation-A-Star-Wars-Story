/*
	   Name: Siavash Samiei
	   Teacher: Dyke
	   Date: xxxx
 */
import java.awt.*;

import hsa.Console;

public class XWings extends Thread
{
    private Console c;
    private Color extras;
    private int xPos, yPos;

    public void drawXWings ()
    {
	for (int i = 0 ; i < 300 ; i++)
	{
	    for (int f = 0 ; f < 75 ; f++)
	    {
		c.setColor (Color.white);
		if (StandardBackground.stars [f] [0] < 5 + i && StandardBackground.stars [f] [1] < 10 + i &&
			StandardBackground.stars [f] [0] + 5 < i + 5 && StandardBackground.stars [f] [1] + 5 < 10 + i + 5)
		    c.setColor (Color.white);
		c.drawStar (StandardBackground.stars [f] [0], StandardBackground.stars [f] [1], 5 + f / 40, 5);
	    }
	    //erase
	    c.setColor (Color.black);
	    c.fillRect ((-140 - xPos) + i, 50 - yPos, 35, 40);
	    c.setColor (Color.darkGray);
	    c.fillRect ((-100 - xPos) + i, 65 - yPos, 40, 10);
	    c.setColor (Color.gray);
	    c.fillRect ((-100 - xPos) + i, 50 - yPos, 15, 15);
	    c.fillRect ((-100 - xPos) + i, 75 - yPos, 15, 15);
	    c.setColor (extras);
	    c.drawLine ((-85 - xPos) + i, 57 - yPos, (-60 - xPos) + i, 57 - yPos);
	    c.drawLine ((-85 - xPos) + i, 82 - yPos, (-60 - xPos) + i, 82 - yPos);
	    int[] triagX = new int [3];
	    triagX [0] = (-60 - xPos) + i;
	    triagX [1] = (-60 - xPos) + i;
	    triagX [2] = (-53 - xPos) + i;

	    int[] triagY = new int [3];
	    triagY [0] = 62 - yPos;
	    triagY [1] = 77 - yPos;
	    triagY [2] = 69 - yPos;
	    c.fillPolygon (triagX, triagY, 3);
	    c.setColor (Color.red);
	    c.fillOval ((-105 - xPos) + i, (55 - yPos), 5, 5);
	    c.fillOval ((-105 - xPos) + i, (80 - yPos), 5, 5);
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }

	    c.update ();
	}
	for (int i = 0 ; i < 400 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawLine (((256 - xPos) + i / 2) + i * 2, 80 - yPos, (256 - xPos) + i * 2, 80 - yPos);
	    c.setColor (Color.green);
	    c.drawLine (((260 - xPos) + i / 2) + i * 2, 80 - yPos, (260 - xPos) + i * 2, 80 - yPos);
	    try
	    {
		sleep (15);

	    }
	    catch (Exception e)
	    {
	    }
	    c.update ();
	}
    }


    public XWings (Console con)
    {
	c = con;
	extras = (Color.yellow);
	xPos = 0;
	yPos = 0;
    }


    public XWings (Console con, Color n, int y)
    {
	c = con;
	extras = n;
	xPos = 0;
	yPos = y;
    }


    public XWings (Console con, Color n, int x, int y)
    {
	c = con;
	extras = n;
	xPos = x;
	yPos = y;
    }


    public void run ()
    {
	drawXWings ();
    }
}
