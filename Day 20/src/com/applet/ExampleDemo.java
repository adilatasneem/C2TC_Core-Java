package com.applet;
interface Interface1 {
  public void m1(); // interface method
}

interface Interface2 {
  public void m2(); // interface method
}
 
public class ExampleDemo implements Interface1, Interface2 {
  public void m1() {
    System.out.println("This is my First interface method");
  }
  public void m2() {
    System.out.println("This is my Second interface method");
  }

}

class Main {
  public static void main(String[] args) {
	  ExampleDemo myObj = new ExampleDemo();
    myObj.m1();
    myObj.m2();
  }
}
 