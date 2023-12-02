import java.util.Random;
import java.util.Scanner;

class Thread2 extends Thread
{
  int num;
  public Thread2 (int num)
  {
    this.num = num;
  }
  public void run ()
  {
    System.out.println ("Square of " + num + "= " + (num * num));
  }
}

class Thread3 extends Thread
{
  int num;
  public Thread3 (int num)
  {
    this.num = num;
  }
  public void run ()
  {
    System.out.println ("Cube of " + num + "= " + (num * num * num));
  }
}

class Thread1 extends Thread
{
  int n;
  public Thread1 (int n)
  {
    this.n = n;
  }
  Random r = new Random ();
  int rand;
  public void run ()
  {
    for (int i = 0; i < n; i++)
      {
	rand = r.nextInt (100);
	System.out.println (rand);
	if (rand % 2 == 0)
	  {
	    Thread2 t2 = new Thread2 (rand);
	    t2.start ();
	  }
	else
	  {
	    Thread3 t3 = new Thread3 (rand);
	    t3.start ();
	  }
	try
	{
	  Thread.sleep (1000);
	}
	catch (InterruptedException e)
	{
	  System.out.println ("Error occured !");
	}
      }
  }
}

class Multithread
{
  public static void main (String[]args) throws InterruptedException
  {
    int n;
    Scanner s = new Scanner (System.in);
      System.out.println ("Enter number of integers to be displayed");
      n = s.nextInt ();
    Thread1 t1 = new Thread1 (n);
      t1.start ();
  }
}
