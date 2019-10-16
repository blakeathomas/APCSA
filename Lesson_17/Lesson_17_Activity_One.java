/*
 * Lesson 9 - Unit 1 - Math functions.
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

public class Lesson_17_Activity_One{

        public static void main (String str[]) throws IOException {
     	Scanner scan = new Scanner (System.in);
		int x = 0;
		int y = 0;
		double z = 0;
     	while (x != -1){
     	System.out.print("Please enter a grade: ");
     	x = scan.nextInt();
     	z += x;
     	y ++;
     	}
<<<<<<< HEAD
		double average = (double)((z+1)/(y-1));
=======
		double average = ((z+1)/(y-1));
>>>>>>> 1d4fc60ac41fd003849aa2adbe86336171c877a6
		System.out.println("The average is: " + average);

     }

}