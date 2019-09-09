import java.util.Scanner;
import java.lang.Math;

public class Lesson_5_Activity_Two {
	public static void main(String[] args){

		int num1, num2, num3, num4, sum;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter Integer 1:");
		num1 = scan.nextInt();

		System.out.println("Please enter Integer 2:");
		num2 = scan.nextInt();

		System.out.println("Please enter Integer 3:");
		num3 = scan.nextInt();

		System.out.println("Please enter Integer 4:");
		num4 = scan.nextInt();

		sum = num1 + num2 + num3 + num4;

		System.out.println("The sum of all the integers is: " + sum);
	}

}