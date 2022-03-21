class Student{
	final int id=10;
	void change() {
		System.out.println("Trying to Change");
	}
}
class lekha extends Student{
	void change() {
		System.out.println("Hi lekha");
	}
}
public class variable {

	public static void main(String[] args) {
	    Student s1 = new Student();
	    s1.change();

	}

}
