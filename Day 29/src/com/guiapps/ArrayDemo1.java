package com.guiapps;

import java.awt.Frame;


import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemo1 extends Frame {
	int[] x;
	int[] y;
	int i;
	public ArrayDemo1() {
		x = new int[7];
		y = new int[7];
		for(i = 0; i<x.length; i++) {
			x[i] = (int)(400* Math.random());
			y[i] = (int)(400*Math.random());
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawPolygon(x, y, 5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayDemo1();

	}

}
