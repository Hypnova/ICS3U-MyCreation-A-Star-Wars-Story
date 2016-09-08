/*
   Name: xxx
   Teacher: xxx
   Date: xxxx
This class is has 3 overloaded constructors!!!
The basic constructor creates a cloud in a specific predetermined location.
The 2nd constructor allows a parameter pass to change the cloud color.
The 3rd constructor creates a cloud with a specific color and a time delay to
control the speed of its movement during the animation.

 */
import java.awt.*;

import hsa.Console;

public class TieFighters extends Thread
{
    private Console c;
    private Color color1, color2, color3;
    private int distanceChangeX, distanceChangeY;
    public void drawTie ()
    {

	for (int i = 0 ; i < 275 ; i++)
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
	    for (int j = 0 ; j < 1 ; j++)
	    {
		c.setColor (Color.black);
		c.fillRect ((750 - distanceChangeX) - i, 60 - distanceChangeY, 40, 36);
	    }
	    // Hex
	    int[] bigHex2 = new int [6];
	    bigHex2 [0] = (750 - distanceChangeX) - i;
	    bigHex2 [1] = (770 - distanceChangeX) - i;
	    bigHex2 [2] = (778 - distanceChangeX) - i;
	    bigHex2 [3] = (770 - distanceChangeX) - i;
	    bigHex2 [4] = (750 - distanceChangeX) - i;
	    bigHex2 [5] = (740 - distanceChangeX) - i;

	    int[] bigHex2Y = new int [6];
	    bigHex2Y [0] = 90 - distanceChangeY;
	    bigHex2Y [1] = 90 - distanceChangeY;
	    bigHex2Y [2] = 75 - distanceChangeY;
	    bigHex2Y [3] = 60 - distanceChangeY;
	    bigHex2Y [4] = 60 - distanceChangeY;
	    bigHex2Y [5] = 75 - distanceChangeY;
	    c.setColor (color1);
	    c.fillPolygon (bigHex2, bigHex2Y, 6);
	    c.setColor (color3);
	    c.drawPolygon (bigHex2, bigHex2Y, 6);

	    //Bigcircle
	    c.setColor (color2);
	    c.fillOval ((748 - distanceChangeX) - i, 65 - distanceChangeY, 20, 20);

	    //back hex
	    int[] bigHex = new int [6];
	    bigHex [0] = (760 - distanceChangeX) - i;
	    bigHex [1] = (780 - distanceChangeX) - i;
	    bigHex [2] = (788 - distanceChangeX) - i;
	    bigHex [3] = (780 - distanceChangeX) - i;
	    bigHex [4] = (760 - distanceChangeX) - i;
	    bigHex [5] = (750 - distanceChangeX) - i;

	    int[] bigHexY = new int [6];
	    bigHexY [0] = 95 - distanceChangeY;
	    bigHexY [1] = 95 - distanceChangeY;
	    bigHexY [2] = 80 - distanceChangeY;
	    bigHexY [3] = 65 - distanceChangeY;
	    bigHexY [4] = 65 - distanceChangeY;
	    bigHexY [5] = 80 - distanceChangeY;


	    c.setColor (color1);
	    c.fillPolygon (bigHex, bigHexY, 6);
	    c.setColor (color3);
	    c.drawPolygon (bigHex, bigHexY, 6);

	    //small circle
	    c.setColor (color3);
	    c.fillRect ((751 - distanceChangeX) - i, 78 - distanceChangeY, 36, 5);
	    c.drawLine ((760 - distanceChangeX) - i, 95 - distanceChangeY, (780 - distanceChangeX) - i, 65 - distanceChangeY);
	    c.drawLine ((780 - distanceChangeX) - i, 95 - distanceChangeY, (760 - distanceChangeX) - i, 65 - distanceChangeY);
	    c.fillOval ((765 - distanceChangeX) - i, 75 - distanceChangeY, 10, 10);
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
	    c.drawLine (((465 - distanceChangeX) + i / 2) - i * 2, 90 - distanceChangeY, (455 - distanceChangeX) - i * 2, 90 - distanceChangeY);
	    c.setColor (Color.red);
	    c.drawLine (((460 - distanceChangeX) + i / 2) - i * 2, 90 - distanceChangeY, (460 - distanceChangeX) - i * 2, 90 - distanceChangeY);
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







    public TieFighters (Console con)
    {
	c = con;

	color1 = new Color (71, 71, 71);
	color2 = new Color (135, 135, 135);
	color3 = new Color (225, 225, 225);
	distanceChangeY = 0;
	distanceChangeX = 0;

    }


    public TieFighters (Console con, Color a, Color b, Color d, int y)
    {
	c = con;
	color1 = a;
	color2 = b;
	color3 = d;
	distanceChangeY = y;
	distanceChangeX = 0;

    }


    public TieFighters (Console con, Color a, Color b, Color d, int x, int y)
    {
	c = con;
	color1 = a;
	color2 = b;
	color3 = d;

	distanceChangeX = x;
	distanceChangeY = y;
    }


    public void run ()
    {
	drawTie ();
    }
}





