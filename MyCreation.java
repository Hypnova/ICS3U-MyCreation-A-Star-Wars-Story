/*
   Name: Siavash Samiei
   Teacher: Ms.Dyke
   Date: 10/14/14
   Description: This class runs all the other threads and classes created in the Siavash9B folder.
   This class creates flow in the animation with threads and runnable.
 */
import java.awt.*;
import hsa.Console;
public class MyCreation
{
    Console c;

    public void background1 ()
    {

	BackgroundScene1 a = new BackgroundScene1 (c);

    }


    public void background2 ()
    {

	BackgroundScene2 b = new BackgroundScene2 (c);

    }


    public void background3 ()
    {

	BackgroundScene3 d = new BackgroundScene3 (c);

    }


    public void background4 ()
    {

	BackgroundScene4 e = new BackgroundScene4 (c);

    }



    public void starDestroyer ()
    {
	ImperialStarDestroyer f = new ImperialStarDestroyer (c);
	f.run ();

    }


    public void deathStarAnim ()
    {
	DeathStarAnim g = new DeathStarAnim (c);
	g.start ();
	try
	{
	    g.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void tieFighter ()
    {
	TieFighters h = new TieFighters (c);
	TieFighters i = new TieFighters (c, Color.black, Color.white, Color.white, -70);
	TieFighters j = new TieFighters (c, Color.white, Color.gray, Color.gray, 50, 40);
	new Thread (h).start ();
	new Thread (i).start ();
	new Thread (j).start ();
	try
	{
	    h.join ();
	    i.join ();
	    j.join ();
	}
	catch (InterruptedException e)
	{
	}


    }


    public void xWings ()
    {
	XWings k = new XWings (c);
	XWings l = new XWings (c, Color.red, -50);
	XWings m = new XWings (c, Color.blue, 60, 40);
	k.start ();
	l.start ();
	m.start ();

	try
	{
	    k.join ();
	    l.join ();
	    m.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void lukeXWing ()
    {
	LukeXWing n = new LukeXWing (c);
	n.start ();
	try
	{
	    n.join ();
	}
	catch (InterruptedException e)
	{
	}

    }


    public void lukeXWing2 ()
    {
	LukeXWing n = new LukeXWing (c, 360);
	n.start ();
	try
	{
	    n.join ();
	}
	catch (InterruptedException e)
	{
	}

    }


    public void darthTieFight ()
    {
	DarthTieFighter o = new DarthTieFighter (c);
	o.start ();
	try
	{
	    o.join ();
	}
	catch (InterruptedException e)
	{
	}

    }


    public void lastFight ()
    {
	LaserExplosion p = new LaserExplosion (c);
	p.start ();


    }


    public MyCreation ()
    {
	c = new Console ("STAR WARS EPISODE VII: The Java Strikes Back");
    }


    public static void main (String[] args)
    {
	MyCreation mc = new MyCreation ();
	mc.background1 ();
	mc.starDestroyer ();
	mc.background2 ();
	mc.deathStarAnim ();
	mc.background3 ();
	mc.tieFighter ();
	mc.xWings ();
	mc.lukeXWing ();
	mc.background4 ();
	mc.lukeXWing2 ();
	mc.darthTieFight ();
	mc.lastFight ();

    }
}
