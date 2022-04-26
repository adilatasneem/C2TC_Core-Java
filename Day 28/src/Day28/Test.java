package Day28;
//Java program to understand 
//the concept of == operator


public class Test {

 public static void main(String[] args)

 {

     String s1 = "HELLO";

     String s2 = "HELLO";

     String s3 =  new String("HELLO");


     System.out.println(s1 == s2); // true

     System.out.println(s1 == s3); // false

     System.out.println(s1.equals(s2)); // true

     System.out.println(s1.equals(s3)); // true

 }
}