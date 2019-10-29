/**
 * @(#)crackTheCode.java
 *
 *
 * @author
 * @version 1.00 2019/10/22
 */
import java.util.Scanner;

public class crackTheCode {

    public static void main (String[] args) {
    	Scanner scan = new Scanner (System.in);
    	int num = 0;

    	//Welecome System.out.println("Hello " + name + ". Try your best to crack the code!");
    	System.out.println("Welcome. What is your name?");
    	String name = scan.nextLine();
    	System.out.println("Hello " + name + ". Try your best to crack the code!\n");
    	System.out.println("Phase 1 \nEnter a number:");
    	num = scan.nextInt();

    	if (num == 3){
    		System.out.println("Correct!");
	    	System.out.println("Phase 2 \nEnter a number:");
	    	num = scan.nextInt();
    			if (num == 1 || (num > 33 && num < 100)) {
    				System.out.println("Correct!");
	    			System.out.println("Phase 3 \nEnter a number:");
	    			num = scan.nextInt();
	    				if (num >= 0 && ((num % 3 == 0) || (num % 7 ==0))){

	    						System.out.println("Correct!");
	    						System.out.println("You have cracked the code!");
	    				} else System.out.println("Sorry, that was incorrect! \nBetter luck next time!");

    			} else System.out.println("Sorry, that was incorrect! \nBetter luck next time!");

    	} else System.out.println("Sorry, that was incorrect! \nBetter luck next time!");

    }


}