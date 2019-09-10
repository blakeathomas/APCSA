/*
 * Lesson 9 - Unit 1 - Math functions.
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

public class Lesson_9_Activity_Two{

     public static void main (String [] args) throws IOException {
			int max = 41;
			int min = -20;
			int range = max - min + 1;
       for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
            System.out.println(rand);
       }
     }

}