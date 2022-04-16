package Day10;

//Using Default//

class Person {
	  String fname = "Meraj";
	  String mname = "Adila";
	  String lname = "Tasneem";
	  String email = "urooj0828@gmail.com";
	  int age = 23;
	  
	  public static void main(String[] args) {
	    Person myObj = new Person();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	}