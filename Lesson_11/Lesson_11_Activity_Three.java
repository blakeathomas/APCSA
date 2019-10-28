
import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_One {



public static void main(String[] args)
   {
   	double num1,num2;
   	Scanner scan = new Scanner(System.in);

   	System.out.println("Please enter a integer:");
   	num1 = scan.nextDouble();

   	System.out.println("Please enter another integer:");
   	num2 = scan.nextDouble();
	if (num1 == num2){
	   System.out.println("YES");
	   } else
		 System.out.println("NO");

    }
}