import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrameP3 extends Frame
{
	TextField t1, t2;
	int i, j;
	
	public ThreadFrameP3()
	{
		setLayout(new FlowLayout());
		
		add(t1 = new TextField(20));
		add(t2 = new TextField(20));
		
		B b = new B(this);
		C c = new C(this);
		
		b.start();
		c.start();
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ThreadFrameP3();
	}
}
class B extends Thread
{
	ThreadFrameP3 thf1;
	
	B(ThreadFrameP3 thf1)
	{
		this.thf1 = thf1;
	}
	public void run()
	{
		while(true)
		{
			thf1.t1.setText(String.valueOf(thf1.i));
			
			if(thf1.i==100)
				thf1.i =0;
			else
				thf1.i++;
			
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{	
			}
		}
	}
}
class C extends Thread
{
	ThreadFrameP3 thf2;
	
	C(ThreadFrameP3 thf2)
	{
		this.thf2 = thf2;
	}
	public void run()
	{
		while(true)
		{
			thf2.t2.setText(String.valueOf(thf2.j));
			if(thf2.j==100)
				thf2.j =0;
			else
				thf2.j++;
			
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{	
			}
		}
	}
}