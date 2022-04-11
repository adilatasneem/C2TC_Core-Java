package Day9;
import java.util.Scanner;
class Add2
{
	public static void main(String[] args) {
		int n1, n2, sum=0;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter First Number: ");
		n1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		n2 = sc.nextInt();
	}
			sum = (n1+n2);
		System.out.println("Sum of Provided Number is:"+sum);
	}
}
