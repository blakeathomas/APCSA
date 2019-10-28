/*
 * Lesson 11 Coding Activity 1
 * Test if an integer input from the keyboard is equal to the integer 176.
 * If it is, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_One {



public static void main(String[] args)
   {
   	int num1;
   	Scanner scan = new Scanner(System.in);

   	System.out.println("Please enter a integer:");
   	num1 = scan.nextInt();
	if (num1 == 176){
	   System.out.println("YES");
	   } else
		 System.out.println("NO");

    }
}