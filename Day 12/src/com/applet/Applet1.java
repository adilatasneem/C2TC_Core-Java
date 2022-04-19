package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet1 extends Applet{
	Button b ;  //declaration area
	TextField t;
	
	public void init() {
		b = new Button();
		t = new TextField();
		b.setLabel("Submit");
		add(b);
		add(t);
	
}
}
