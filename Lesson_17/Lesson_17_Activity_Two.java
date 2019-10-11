/*
 * Lesson 9 - Unit 1 - Math functions.
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

public class Lesson_17_Activity_Two{

        public static void main (String str[]) throws IOException {
     	Scanner scan = new Scanner (System.in);
		int num1 = 0, num2 = 0;
		System.out.println("Enter two numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		while (num1 <= num2) {
			if ((num1 % 2) == 0)
				System.out.print(num1 + " ");
			num1 ++;
		}


     }

}