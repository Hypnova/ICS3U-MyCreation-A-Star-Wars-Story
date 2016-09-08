/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/19/14
   Description: This is a class that animates Darth Vaders Customized
   Tie Fighter in the fourth and final scene of the animation. Thus class extends
   Thread.
 */
import java.awt.*;
import hsa.Console;

public class DarthTieFighter extends Thread
{
    //Instance variable declaration.
    private Console c;
    private Color gray1 = new Color (71, 71, 71);
    private Color gray2 = new Color (135, 135, 135);
    private Color gray3 = new Color (225, 225, 225);
    //Method to animate Darthe Vaders Tie Fighter
    public void drawDarthTie ()
    {
	for (int i = 0 ; i < 245 ; i++)
	{
	    //Erase
	    c.setColor (Color.black);
	    c.fillRect (645 - i, 150, 245, 220);
	    //Redrawing stars
	    for (int f = 0 ; f < 75 ; f++)
	    {
		c.setColor (Color.white);
		if (StandardBackground.stars [f] [0] < 5 + i
			&& StandardBackground.stars [f] [1] < 10 + i &&
			StandardBackground.stars [f] [0] + 5 < i + 5 && StandardBackground.stars [f] [1] + 5 < 10 + i + 5)
		    c.setColor (Color.white);
		c.drawStar (StandardBackground.stars [f] [0], StandardBackground.stars [f] [1], 5 + f / 40, 5);

	    }
	    //Middle Back Rectangle
	    c.setColor (gray2);
	    c.fillRect (645 - i, 220, 175, 75);
	    //Top Back Trapezoid
	    int[] xTieCoordBack1 = new int [4];
	    xTieCoordBack1 [0] = 645 - i;
	    xTieCoordBack1 [1] = 655 - i;
	    xTieCoordBack1 [2] = 810 - i;
	    xTieCoordBack1 [3] = 820 - i;

	    int[] yTieCoordBack1 = new int [4];
	    yTieCoordBack1 [0] = 220;
	    yTieCoordBack1 [1] = 150;
	    yTieCoordBack1 [2] = 150;
	    yTieCoordBack1 [3] = 220;

	    c.setColor (gray1);
	    c.fillPolygon (xTieCoordBack1, yTieCoordBack1, 4);
	    //Bottom back trapezoid
	    int[] xTieCoordBack2 = new int [4];
	    xTieCoordBack2 [0] = 645 - i;
	    xTieCoordBack2 [1] = 655 - i;
	    xTieCoordBack2 [2] = 810 - i;
	    xTieCoordBack2 [3] = 820 - i;

	    int[] yTieCoordBack2 = new int [4];
	    yTieCoordBack2 [0] = 295;
	    yTieCoordBack2 [1] = 365;
	    yTieCoordBack2 [2] = 365;
	    yTieCoordBack2 [3] = 295;
	    c.setColor (gray1);
	    c.fillPolygon (xTieCoordBack2, yTieCoordBack2, 4);
	    //Middle oval
	    c.setColor (gray3);
	    c.fillOval (665 - i, 210, 100, 100);
	    c.setColor (gray1);
	    c.fillOval (665 - i, 222, 30, 70);
	    c.setColor (Color.black);
	    c.fillRect (695 - i, 250, 20, 10);
	    c.drawLine (690 - i, 239, 715 - i, 225);
	    c.drawLine (690 - i, 274, 715 - i, 288);
	    //Front middle rectangle
	    c.setColor (gray2);
	    c.fillRect (715 - i, 225, 175, 75);
	    //Front top trapezoid
	    int[] xTieCoordFront1 = new int [4];
	    xTieCoordFront1 [0] = 715 - i;
	    xTieCoordFront1 [1] = 725 - i;
	    xTieCoordFront1 [2] = 880 - i;
	    xTieCoordFront1 [3] = 890 - i;

	    int[] yTieCoordFront1 = new int [4];
	    yTieCoordFront1 [0] = 225;
	    yTieCoordFront1 [1] = 155;
	    yTieCoordFront1 [2] = 155;
	    yTieCoordFront1 [3] = 225;

	    c.setColor (gray3);
	    c.fillPolygon (xTieCoordFront1, yTieCoordFront1, 4);
	    //Front bottom trapezoid
	    int[] xTieCoordFront2 = new int [4];
	    xTieCoordFront2 [0] = 715 - i;
	    xTieCoordFront2 [1] = 725 - i;
	    xTieCoordFront2 [2] = 880 - i;
	    xTieCoordFront2 [3] = 890 - i;

	    int[] yTieCoordFront2 = new int [4];
	    yTieCoordFront2 [0] = 300;
	    yTieCoordFront2 [1] = 370;
	    yTieCoordFront2 [2] = 370;
	    yTieCoordFront2 [3] = 300;
	    c.setColor (gray3);
	    c.fillPolygon (xTieCoordFront2, yTieCoordFront2, 4);
	    //Farthest forward rectangle design
	    c.setColor (Color.black);
	    c.fillRect (735 - i, 225, 20, 75);
	    try
	    {
		sleep (30);
	    }
	    catch (Exception e)
	    {

	    }
	    c.update ();
	}
    }


    public DarthTieFighter (Console con)
    {
	c = con;

    }


    //Mehtod to run drawDarthTie
    public void run ()
    {
	drawDarthTie ();
    }
}





