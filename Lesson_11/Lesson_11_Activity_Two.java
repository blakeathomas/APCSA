/*
 * Lesson 11 Coding Activity 2
 * Test if a decimal value input from the keyboard is equal to 48.729.
 * If it is, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_One {



public static void main(String[] args)
   {
   	double num1;
   	Scanner scan = new Scanner(System.in);

   	System.out.println("Please enter a integer:");
   	num1 = scan.nextDouble();
	if (num1 == 48.729){
	   System.out.println("YES");
	   } else
		 System.out.println("NO");

    }
}