
import java.util.Scanner;
public class Assessment1{
static {
	System.out.println("--------------------");
	}
	static double vi = 0;
    public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number-");
	        double num1 = sc.nextDouble();
			System.out.println("Enter seond number-");
			double num2 = sc.nextDouble();
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("--------------------");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Adding two numbers...");
				vi = num1 + num2;
				break;
			case 2:
				System.out.println("Substracting two numbers");
				vi = num1 - num2;
				break;
			case 3:
				System.out.println("Multiplying two numbers...");
				vi = num1 * num2;
				break;
			case '4':
				System.out.println("Dividing two numbers");
				vi = num1 / num2;
				break;
			}
			System.out.println("Result of " + num1 + " and " + num2 + " is " + vi);
		}
	}
}