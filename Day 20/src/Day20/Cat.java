package Day20;

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Cat extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The sound Cat do: Meow Meow");
  }
}

class Main {
  public static void main(String[] args) {
    Cat myCat = new Cat(); // Create a Pig object
    myCat.animalSound();
    myCat.sleep();
  }
}