package Day11;

abstract class Bike{  
  abstract void run();  
}  
class Honda extends Bike{  
void run(){System.out.println("My Bike is running safely");}  
public static void main(String args[]){  
 Bike obj = new Honda();  
 obj.run();  
}  
}
