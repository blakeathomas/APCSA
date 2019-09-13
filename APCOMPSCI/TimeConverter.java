import java.util.Scanner;
import java.lang.Math;

public class TimeConverter {
	public static void main (String[] args) {

		int initSecs, years;
		Scanner scan = new Scanner (System.in);

		System.out.print("Please enter the desired seconds to convert: ");
		initSecs = scan.nextInt();
		System.out.print("\n");

		years = (initSecs/31536000);

		System.out.print(years);
	}
}