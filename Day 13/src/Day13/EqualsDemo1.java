package Day13;
 
public class EqualsDemo1 {  
    public static void main(String[] args) {
        int val1 = 7;
        int val2 = -3;
        int val3 = 7;
         
        if(val1 == val2) {
            System.out.println("val1 and val2 are equal");
        } else {
            System.out.println("val1 and val2 are Not equal");
        }   
 
        if(val3 == val1) {
            System.out.println("val1 and val3 are equal");
        }else {
            System.out.println("val1 and val3 are not equal");
        }         
    }
}