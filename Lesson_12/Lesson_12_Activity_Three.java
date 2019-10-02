/*
 * Lesson 12 Coding Activity 3
 * Test if a number input from the keyboard is a valid
 * test score (between 0 and 100 inclusive).
 *
 *     Sample Run 1
 *         Enter a test score:
 *         78.5
 *         Valid
 *
 *
 *      Sample Run 2
 *         Enter a test score:
 *         179
 *         Not Valid
 *
 */

import java.util.Scanner;

class Lesson_12_Activity_Three {
    public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);
    int x, y;
    double num;

    System.out.println("Please enter a score: ");
    num = scan.nextDouble();

	x = 0;
	y = 100;
    if (num >= x && num <= y){
    	System.out.println("Valid");
    } else {

    	System.out.println("Invalid");
    	}
	}
}