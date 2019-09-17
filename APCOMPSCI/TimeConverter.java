import java.util.Scanner;
import java.lang.Math;

public class TimeConverter {
	public static void main (String[] args) {

		int initSecs, years, months, days, hours, mins, secs;
		Scanner scan = new Scanner (System.in);

		System.out.print("Seconds since Unix Epoch: ");
		initSecs = scan.nextInt();
		System.out.print("\n");

		years = (1970 + (initSecs/31104000));
		months = ((initSecs%31104000)/2592000);
		days =   (((initSecs%31104000)%2592000)/86400);
		hours = ((((initSecs%31104000)%2592000)%86400)/3600);
		mins = (((((initSecs%31104000)%2592000)%86400)%3600)/60);
		secs = (((((initSecs%31104000)%2592000)%86400)%3600)%60);

		System.out.print("Year: " + years + "\nMonth: " + months + "\nDay: " + days
			+ "\nHour: " + hours + "\nMin: " + mins + "\nSec: " + secs);
	}
}