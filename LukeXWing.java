/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date:

 */
import java.awt.*;

import hsa.Console;

public class LukeXWing extends Thread
{
    private Console c;
    private Color bGray1 = new Color (71, 71, 71);
    private Color bGray2 = new Color (200, 200, 200);
    private int distanceMove;
    public static boolean lasers;
    public void drawLukeX ()
    {
	for (int i = 0 ; i < distanceMove ; i++)
	{

	    //Erase
	    c.setColor (Color.black);
	    c.fillRect (-346 + i, 189, 345, 136);
	    //Redraw Stars
	    for (int f = 0 ; f < 75 ; f++)
	    {
		c.setColor (Color.white);

		if (StandardBackground.stars [f] [0] < 5 + i
			&& StandardBackground.stars [f] [1] < 10 + i &&
			StandardBackground.stars [f] [0] + 5 < i + 5 && StandardBackground.stars [f] [1] + 5 < 10 + i + 5)
		    c.setColor (Color.white);
		c.drawStar (StandardBackground.stars [f] [0], StandardBackground.stars [f] [1], 5 + f / 40, 5);

	    }
	    //Top back blasters
	    c.setColor (Color.white);
	    c.fillRect (-240 + i, 200, 50, 10);
	    c.setColor (Color.yellow);
	    c.fillOval (-195 + i, 199, 10, 11);
	    c.setColor (Color.white);
	    c.drawLine (-185 + i, 205, -110 + i, 205);
	    //Mid Triangle
	    int[] midTriagX = new int [4];
	    midTriagX [0] = -305 + i;
	    midTriagX [1] = -215 + i;
	    midTriagX [2] = -140 + i;
	    midTriagX [3] = -250 + i;

	    int[] midTriagY = new int [4];
	    midTriagY [0] = 210;
	    midTriagY [1] = 210;
	    midTriagY [2] = 230;
	    midTriagY [3] = 230;
	    c.fillPolygon (midTriagX, midTriagY, 4);
	    //Mid Blaster Ovals
	    c.setColor (Color.yellow);
	    c.fillOval (-235 + i, 210, 15, 20);
	    //Mid section thing
	    c.setColor (Color.white);
	    c.fillRect (-240 + i, 230, 200, 45);
	    //Red Mid Section
	    c.setColor (Color.red);
	    c.fillRect (-240 + i, 245, 200, 20);
	    //Middle of Wings
	    c.setColor (bGray1);
	    c.fillRect (-310 + i, 245, 90, 30);
	    //Front lower back blaster
	    c.setColor (bGray1);
	    c.fillRect (-240 + i, 290, 50, 10);
	    c.setColor (Color.yellow);
	    c.fillOval (-195 + i, 289, 10, 11);
	    c.setColor (Color.white);
	    c.drawLine (-185 + i, 295, -95 + i, 295);
	    //Front mid blaster
	    c.setColor (Color.white);
	    c.fillRect (-250 + i, 270, 25, 20);
	    c.setColor (Color.yellow);
	    c.fillOval (-235 + i, 270, 15, 20);
	    //Front triangles
	    int[] frontTriagX = new int [3];
	    frontTriagX [0] = -40 + i;
	    frontTriagX [1] = 0 + i;
	    frontTriagX [2] = -40 + i;
	    int[] frontTriagY = new int [3];
	    frontTriagY [0] = 230;
	    frontTriagY [1] = 255;
	    frontTriagY [2] = 255;
	    c.setColor (Color.yellow);
	    c.fillPolygon (frontTriagX, frontTriagY, 3);

	    int[] frontTriagX2 = new int [3];
	    frontTriagX2 [0] = -40 + i;
	    frontTriagX2 [1] = 0 + i;
	    frontTriagX2 [2] = -40 + i;
	    int[] frontTriagY2 = new int [3];
	    frontTriagY2 [0] = 255;
	    frontTriagY2 [1] = 255;
	    frontTriagY2 [2] = 275;
	    c.setColor (Color.white);
	    c.fillPolygon (frontTriagX2, frontTriagY2, 3);

	    int[] topWingX = new int [4];
	    topWingX [0] = -340 + i;
	    topWingX [1] = -260 + i;
	    topWingX [2] = -230 + i;
	    topWingX [3] = -310 + i;
	    int[] topWingY = new int [4];
	    topWingY [0] = 200;
	    topWingY [1] = 200;
	    topWingY [2] = 245;
	    topWingY [3] = 245;
	    c.setColor (bGray2);
	    c.fillPolygon (topWingX, topWingY, 4);

	    int[] topWingX2 = new int [4];
	    topWingX2 [0] = -310 + i;
	    topWingX2 [1] = -230 + i;
	    topWingX2 [2] = -260 + i;
	    topWingX2 [3] = -340 + i;
	    int[] topWingY2 = new int [4];
	    topWingY2 [0] = 270;
	    topWingY2 [1] = 270;
	    topWingY2 [2] = 315;
	    topWingY2 [3] = 315;
	    c.setColor (bGray2);
	    c.fillPolygon (topWingX2, topWingY2, 4);
	    //Wing blasters
	    c.setColor (Color.white);
	    c.fillRect (-345 + i, 190, 70, 10);
	    c.fillRect (-345 + i, 315, 70, 10);
	    c.drawLine (-281 + i, 195, -180 + i, 195);
	    c.drawLine (-281 + i, 320, -180 + i, 320);
	    c.setColor (Color.yellow);
	    c.fillOval (-283 + i, 189, 11, 11);
	    c.fillOval (-283 + i, 314, 11, 11);
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	    c.update ();
	}

    }


    public LukeXWing (Console con)
    {
	c = con;
	distanceMove = 1040;

    }


    public LukeXWing (Console con, int x)
    {
	c = con;
	distanceMove = x;

    }


    public void run ()
    {
	drawLukeX ();
    }
}
