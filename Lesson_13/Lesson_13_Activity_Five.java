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
		int x = 0;
		int y = 0;
     	while (x > -1){
     	x = x + scan.nextInt();
     	y++;
     	}
		int average = (x/y);
		System.out.println(average);


     }

}