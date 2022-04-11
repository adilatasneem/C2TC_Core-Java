
package Day9;
import java.io.*;
class Add3
{
       public static void main(String args[]) throws Exception
            {
            int n1, n2, sum;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the two numbers to add:");
            n1 = Integer.parseInt(br.readLine());
            n2 = Integer.parseInt(br.readLine());
            sum = (n1+n2);
            System.out.println("\nSum of two numbers:" + sum);
        }
}
