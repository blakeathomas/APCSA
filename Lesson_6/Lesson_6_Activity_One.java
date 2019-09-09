import java.util.Scanner;
import java.lang.Math;


public class Lesson_6_Activity_One {
		public static void main (String [] args) {

		int w,x,y,z;

		Scanner scan = new Scanner (System.in);

		System.out.println("Enter a three digit number: ");
		z = scan.nextInt();
		w = z % 7;
		x = z % 11;
		y = z % 67;
		System.out.println(w + "\n" + x + "\n" + y);



	}
}