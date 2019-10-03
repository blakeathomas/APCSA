import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

public class Lesson_14_Activity_Three{

        public static void main (String str[]) throws IOException {
        	int octOne, octTwo, octThree, octFour, one, two, three, four, error;
        	String result = "";
        	Scanner scan = new Scanner (System.in);

			error = 0;
        	System.out.println("Please enter the first octet:");
        	octOne = scan.nextInt();

        	System.out.println("Please enter the second octet:");
        	octTwo = scan.nextInt();

        	System.out.println("Please enter the third octet:");
        	octThree = scan.nextInt();

        	System.out.println("Please enter the fourth octet:");
        	octFour = scan.nextInt();

			if (octOne >= 0 && octOne <= 255){
				result = (octOne + ".");
			} else {
				System.out.println("Octet 1 is incorrect");
				error = error + 1;
			}
			if (octTwo >= 0 && octTwo <= 255){
				result = (octOne + "." + octTwo + ".");
			} else {
				System.out.println("Octet 2 is incorrect");
				error = error + 1;
			}
			if (octThree >= 0 && octThree <= 255){
				result = (octOne + "." + octTwo + "." + octThree + ".");
			} else {
				System.out.println("Octet 3 is incorrect");
				error = error + 1;
			}
			if (octFour >= 0 && octFour <= 255){
				result = (octOne + "." + octTwo + "." + octThree + "." + octFour);
			} else {
				System.out.println("Octet 4 is incorrect");
				error = error + 1;
			}
			if (error <= 0){
				System.out.println("IP Address: " + result);
			} else {
				System.out.print("");
			}


        }
}