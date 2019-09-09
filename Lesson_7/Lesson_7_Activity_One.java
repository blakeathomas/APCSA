import java.util.Scanner;
import java.lang.Math;


public class Lesson_7_Activity_One {
		public static void main (String [] args) {

		int v,w,x,y,z;

		Scanner scan = new Scanner (System.in);

		System.out.println("Enter a three digit number: ");
		z = scan.nextInt();
		w = z / 100 % 10;
		x = z / 10 % 10;
		y = z / 1 % 10;
		v = w + x + y;
		System.out.println(w + "\n" + x + "\n" + y);

		System.out.println(w + " + " + x + " + " + y + " = " + v);



	}
}