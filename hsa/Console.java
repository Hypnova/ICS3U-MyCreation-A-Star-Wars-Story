package hsa;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class Console extends JPanel
{
    JFrame frame;
    BufferedImage buffer;
    Graphics2D g2d;
    boolean offScreenOnly = true;

    int width = 640;
    int height = 500;
    //Print fields
    int row = 1; //Current row
    int col = 1; //Current column
    int maxRow = height / 12;
    int maxCol = (width + 6) / 7;

    public Console ()
    {
	buffer = new BufferedImage (width, height, BufferedImage.TYPE_INT_RGB);
	g2d = buffer.createGraphics ();
	frame = new JFrame ();
	frame.getContentPane ().add (this);
	frame.setSize (width, height);
	frame.setLocationRelativeTo (null);
	frame.setResizable (false);
	frame.setVisible (true);
	frame.setVisible (true);
    }


    public Console (String title)
    {
	this ();
	frame.setTitle (title);
    }


    public void setColor (Color c)
    {
	g2d.setColor (c);
    }


    public void drawDot (int x, int y)
    {
	g2d.drawLine (x, y, x, y);
    }


    public void drawLine (int x1, int y1, int x2, int y2)
    {
	g2d.drawLine (x1, y1, x2, y2);
    }


    public void drawRect (int x, int y, int w, int h)
    {
	g2d.drawRect (x, y, w, h);
    }


    public void fillRect (int x, int y, int w, int h)
    {
	g2d.fillRect (x, y, w, h);
    }


    public void drawRoundRect (int x, int y, int w, int h, int sa, int nd)
    {
	g2d.drawRoundRect (x, y, w, h, sa, nd);
    }


    public void fillRoundRect (int x, int y, int w, int h, int sa, int nd)
    {
	g2d.fillRoundRect (x, y, w, h, sa, nd);
    }


    public void drawOval (int x, int y, int w, int h)
    {
	g2d.drawOval (x, y, w, h);
    }


    public void fillOval (int x, int y, int w, int h)
    {
	g2d.fillOval (x, y, w, h);
    }


    public void drawArc (int x, int y, int w, int h, int sa, int aa)
    {
	g2d.drawArc (x, y, w, h, sa, aa);
    }


    public void fillArc (int x, int y, int w, int h, int sa, int aa)
    {
	g2d.fillArc (x, y, w, h, sa, aa);
    }


    public void drawPolygon (int[] x, int[] y, int points)
    {
	g2d.drawPolygon (x, y, points);
    }


    public void fillPolygon (int[] x, int[] y, int points)
    {
	g2d.fillPolygon (x, y, points);
    }

    public void drawString (String s, int x, int y)
    {
	g2d.drawString (s, x, y);
    }


    public void drawStar (int x, int y, int width, int height)
    {
	int[] xPoints, yPoints;
	float rx, ry, xc, yc;

	rx = width;
	ry = height;
	xc = x + rx / 2;
	yc = y + height;

	xPoints = new int [11];
	yPoints = new int [11];
	xPoints [0] = (int) xc;
	yPoints [0] = (int) (yc - ry);
	xPoints [1] = (int) (xc + rx * 0.118034);
	yPoints [1] = (int) (yc - ry * 0.618560);
	xPoints [2] = (int) (xc + rx * 0.500000);
	yPoints [2] = yPoints [1];
	xPoints [3] = (int) (xc + rx * 0.190983);
	yPoints [3] = (int) (yc - ry * 0.381759);
	xPoints [4] = (int) (xc + rx * 0.309017);
	yPoints [4] = (int) yc;
	xPoints [5] = (int) xc;
	yPoints [5] = (int) (yc - ry * 0.236068);
	xPoints [6] = (int) (xc - rx * 0.309017);
	yPoints [6] = yPoints [4];
	xPoints [7] = (int) (xc - rx * 0.190983);
	yPoints [7] = yPoints [3];
	xPoints [8] = (int) (xc - rx * 0.500000);
	yPoints [8] = yPoints [2];
	xPoints [9] = (int) (xc - rx * 0.118034);
	yPoints [9] = yPoints [1];
	xPoints [10] = xPoints [0];
	yPoints [10] = yPoints [0];
	g2d.drawPolygon (xPoints, yPoints, 11);
    }


    public void fillStar (int x, int y, int width, int height)
    {
	int[] xPoints, yPoints;
	float rx, ry, xc, yc;

	rx = width;
	ry = height;
	xc = x + rx / 2;
	yc = y + height;

	xPoints = new int [11];
	yPoints = new int [11];
	xPoints [0] = (int) xc;
	yPoints [0] = (int) (yc - ry);
	xPoints [1] = (int) (xc + rx * 0.118034);
	yPoints [1] = (int) (yc - ry * 0.618560);
	xPoints [2] = (int) (xc + rx * 0.500000);
	yPoints [2] = yPoints [1];
	xPoints [3] = (int) (xc + rx * 0.190983);
	yPoints [3] = (int) (yc - ry * 0.381759);
	xPoints [4] = (int) (xc + rx * 0.309017);
	yPoints [4] = (int) yc;
	xPoints [5] = (int) xc;
	yPoints [5] = (int) (yc - ry * 0.236068);
	xPoints [6] = (int) (xc - rx * 0.309017);
	yPoints [6] = yPoints [4];
	xPoints [7] = (int) (xc - rx * 0.190983);
	yPoints [7] = yPoints [3];
	xPoints [8] = (int) (xc - rx * 0.500000);
	yPoints [8] = yPoints [2];
	xPoints [9] = (int) (xc - rx * 0.118034);
	yPoints [9] = yPoints [1];
	xPoints [10] = xPoints [0];
	yPoints [10] = yPoints [0];
	g2d.fillPolygon (xPoints, yPoints, 11);
    }


    public void update ()
    {
	repaint ();
    }


    public void paint (Graphics g)
    {
	Graphics2D graphics = (Graphics2D) g;
	graphics.drawImage (buffer, null, 0, 0);
    }
}


