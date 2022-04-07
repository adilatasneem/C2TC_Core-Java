package Day7;
class Shape {
	public void display() {
		System.out.println("We are displaying Output");
	}
}
class Rectangle extends Shape {
	public void area() {
		System.out.println("We are displaying the Area of a Rectangle");
	}
}
class Cube extends Rectangle {
	public void volume() {
		System.out.println("We are displaying the volume of a Rectangle");	
}
}
public class Tester {
	public static void main(String[] args) {
		Cube cube = new Cube();
		cube.display();
		cube.area();
		cube.volume();
	}

}
