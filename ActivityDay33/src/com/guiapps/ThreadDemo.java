package com.guiapps;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.TextField;

public class ThreadDemo extends Applet implements Runnable {	
	TextField t1,t2;
	Thread th1,th2;
	int i,j;
	
	public void init() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		Thread th1 = new Thread(this);
		Thread th2 = new Thread(this);
		th1.start();
		th2.start();
		}
	
	public void run() {
	while(true) {
		Thread th = Thread.currentThread();
		if(th.equals(th1)) {
			t1.setText(String.valueOf(i));
			if(i == 100)
				i=0;
			else
				i++;
		}
		if(th.equals(th2)) {
			t2.setText(String.valueOf(i));
			if(j == 100)
				j=0;
			else
				j++;
		}
		try {
			Thread.sleep(10);
		}
		catch(Exception e) {
		}
		}
	}
}
