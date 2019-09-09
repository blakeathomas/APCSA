import java.util.Scanner;
import java.lang.Math;


public class MovieRating {
		public static void main (String [] args) {
		int userRatingOne, userRatingTwo, userRatingThree;
		double focusGroupOne, focusGroupTwo, movieCritic;
		double avgWebRating, avgFocusGroupRating, overallMovieRating;

		Scanner scan = new Scanner (System.in);

		System.out.println("Please enter ratings from the movie review website.");

		System.out.println("\nRating One: ");
		userRatingOne = scan.nextInt();

		System.out.println("\nRating Two: ");
		userRatingTwo = scan.nextInt();

		System.out.println("\nRating Three: ");
		userRatingThree = scan.nextInt();


		System.out.println("\n\nPlease enter ratings from the focus group.");

		System.out.println("\nRating One: ");
		focusGroupOne = scan.nextDouble();

		System.out.println("\nRating Two: ");
		focusGroupTwo = scan.nextDouble();

	    System.out.println("\n\nPlease enter the average movie critic rating.");

		System.out.println("\nRating: ");
		movieCritic = scan.nextDouble();

		avgWebRating = ((double)(userRatingOne + userRatingTwo + userRatingThree)/3);
		avgFocusGroupRating = (( focusGroupOne + focusGroupTwo) /2 );
		overallMovieRating = ((avgWebRating * .2) + (avgFocusGroupRating * .3) + (movieCritic * .5));

		System.out.println("\n\nAverage website rating: " + avgWebRating);

		System.out.println("\nAverage focus group rating: " + avgFocusGroupRating);

		System.out.println("\nAverage movie critic rating: " + movieCritic);

		System.out.println("\nOverall movie rating: " + overallMovieRating);
	}
}