import java.util.Scanner;
import java.lang.Math;

public class Lesson_5_Activity_Three {

	public static void main(String[] args){
		double rad;
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter a radius: ");
		rad = scan.nextDouble();

		System.out.println("The circumference is: " + (2 * 3.14 * rad ));

		System.out.println("The area is: " + (3.14 * rad * rad));

	}
}