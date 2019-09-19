/*
 * Blake Thomas
 * 9/19/2019
 *
 */

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Four {
public static void main(String[] args) {


   Scanner scan = new Scanner (System.in);
   int num1;

   System.out.println("Please enter an integer:");
   num1 = scan.nextInt();

   if (num1 % 2 > 0  ) {
   	System.out.println ("Odd");

   } else {
   	System.out.println("Even");
   }
    }
}