/*
 * Lesson 9 - Unit 1 - Math functions.
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

public class Lesson_13_Activity_Five{

        public static void main (String str[]) throws IOException {
     	Scanner scan = new Scanner (System.in);
     	double result;
			int y = (int) ((Math.random() *12) +1 );
            int x = (int) ((Math.random() *12) +1 );
            System.out.println (x + " * " + y + " = ?");
			result = scan.nextInt();
			if (result == (x*y)){
				System.out.println("Correct!");
			} else {
				System.out.println("Wrong");
			}



     }

}