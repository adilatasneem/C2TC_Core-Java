package com.applet;
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Applet5 extends Applet{
	
	Panel1 p1;
	Panel2 p2;

	public void init() {
		setLayout(new GridLayout(1,2));
		add(p1= new Panel1());
		add(p2= new Panel2());
		p2.c1.setState(true);
		p2.c2.setState(true);
		p2.c3.setState(false);
		p2.t.setText("4000");
		p2.t.setEditable(false);
		
	}
	public boolean action(Event e, Object o) {
		if(p1.c1.getState())
		{
			p2.c1.setState(true);
			p2.c2.setState(true);
			p2.c3.setState(false);
			p2.t.setText("6000");
		}
		if(p1.c2.getState())
		{
			p2.c1.setState(false);
			p2.c2.setState(true);
			p2.c3.setState(true);
			p2.t.setText("8000");
		}
		if(p1.c3.getState())
		{
			p2.c1.setState(true);
			p2.c2.setState(false);
			p2.c3.setState(true);
			p2.t.setText("9000");
		}
		return true;
	}
	
}
class Panel1 extends Panel{
	Checkbox c1,c2,c3;
	CheckboxGroup group;
	public Panel1() {
		setLayout(new GridLayout(3,1));
		group = new CheckboxGroup();
		add(c1 = new Checkbox("Tour 1", group, true));
		add(c2 = new Checkbox("Tour 2", group, false));
		add(c3 = new Checkbox("Tour 3", group, false));
	}
	
}
class Panel2 extends Panel{

	Checkbox c1,c2,c3;
	TextField t;
	public Panel2() {
		setLayout(new GridLayout(4,1));
		add(c1 = new Checkbox("Manali"));
		add(c2 = new Checkbox("Shimla"));
		add(c3 = new Checkbox("Dalhousie"));
		add(t = new TextField(15));
	}
}
