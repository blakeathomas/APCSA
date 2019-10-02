
import java.util.Scanner;
import java.lang.Math;
class Lesson_12_Activity_Four {
    public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);
    int x;

    System.out.println("Integers: ");
    x = scan.nextInt();

    if (x == 4){
    	System.out.println("A");
    } else if (x == 3){
    	System.out.println("B");
    	} else if (x == 2){
    	System.out.println("C");
    		} else if (x == 1) {
    		System.out.println("D");
    	} else {
    		System.out.println("F");
    	}
	}
}