//import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class arrayStats {

	public static void main(String[] args) {
		int arrayNum = 0;
		Scanner scan = new Scanner (System.in);
		double sum = 0;


		System.out.println("How long do you want the array?");
		arrayNum = scan.nextInt();

		if (arrayNum >= 0) {
			double [] array = new double [arrayNum];

			//Filling the array
			for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number");
			array[i] = scan.nextDouble();
			}

			//Printing the array
			for (int i = 0; i < array.length; i++) {
				if (i== 0)
					System.out.print("Your array is {" + array[i] + ", ");
				else if (i == array.length-1)
					System.out.print(array[i] + "}");
				else System.out.print(array[i] + ", ");
				}

			//Average of the array
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
				}
			System.out.println("\nThe average is " + (sum/(array.length*1.0)));

			//Range of the array
			double rangeMin = array[0];
			double rangeMax = array[0];
			int count = 0;

			while (count < array.length) {
				if (array[count] > rangeMax)
					rangeMax = array[count];
				else if (array[count] < rangeMin)
					rangeMin = array[count];
					count++;
				}
			System.out.println("The range is " + (rangeMax-rangeMin));
		}
		else System.out.println("Not a valid length");
	}

}