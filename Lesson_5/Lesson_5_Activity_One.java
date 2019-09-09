import java.util.Scanner;
import java.lang.Math;

public class Lesson_5_Activity_One {
	public static void main(String[] args) {

		double num1, num2, diff;
		Scanner scan = new Scanner (System.in);

		System.out.println("Please enter a decimal number:");
		num1 = scan.nextDouble();

		System.out.println("Please enter another a decimal number:");
		num2 = scan.nextDouble();

		diff = num1- num2;

		System.out.println("The difference between the two numbers is:");
		System.out.println (diff);
	}
}