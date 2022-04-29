package com.thread;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrame3 extends Frame 
{
	TextField t1,t2;
	int i,j;
	
	public ThreadFrame3() 
	{
		setLayout(new FlowLayout());
		
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		
	    C c =new C(this);
		c.start();
		
		D d =new D(this);
		d.start();
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				
				System.exit(0);
			}
			
		});
		setSize(200,400);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new ThreadFrame3();
	}

}

class C extends Thread {
	ThreadFrame3 thf1;
	C(ThreadFrame3 thf1)
	{
		this.thf1=thf1;
		
	}
	public void run() {
		while(true)
		{
			
		      thf1.t1.setText(String.valueOf(thf1.i));
			if(thf1.i==100)
				thf1.i=0;
			else
				thf1.i++;
		}
	}
		
	}	
	

class D extends Thread
{
	ThreadFrame3 thf2;
	D(ThreadFrame3 thf2)
	{
		this.thf2=thf2;
		
	}
	
public void run() 
{
	
	while(true)
	{
		
	      thf2.t2.setText(String.valueOf(thf2.j));
		if(thf2.j==100)
			thf2.j=0;
		else
			thf2.j++;
	}
}
	}