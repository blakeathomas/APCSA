import java.util.Scanner;

public class mini_String_Problems {
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);

		//Excersise One
		System.out.print("Type your name: ");
		String nameLen = scan.nextLine();
		System.out.print("Number of characters: " + nameLen.length());

		//Excersise Two
		System.out.print("\nType your name: ");
		String nameFirstChar = scan.nextLine();
		System.out.print("Number of characters: " + nameFirstChar.charAt(0));

		//Excersise Three
		System.out.print("\nType your name: ");
		String nameLastChar = scan.nextLine();
		System.out.print("Number of characters: " + nameLastChar.charAt((nameLastChar.length()) - 1));

		//Excersise Four
		System.out.print("\nType your name: ");
		String nameFirstThreeChar = scan.nextLine();
		if (nameFirstThreeChar.length() >= 3){
			System.out.println("1. character: " + nameLastChar.charAt(0));
			System.out.println("2. character: " + nameLastChar.charAt(1));
			System.out.println("3. character: " + nameLastChar.charAt(2));
		}

		//Excersise Five
		System.out.print("\nType your name: ");
		String nameSeperateChar = scan.nextLine();
		int x = 0;
		while (x < nameSeperateChar.length()){
			System.out.println((x+1) +". character: " + nameSeperateChar.charAt(x));
			x++;
		}

		//Excersise Six
		System.out.print("\nType your name: ");
		String nameReverse = scan.nextLine();
		x = (nameReverse.length() - 1);
		System.out.print("In reverse order: ");
		while (x >= 0){
			System.out.print(nameReverse.charAt(x));
			x--;
		}

		//Excersise Six
		System.out.print("\nType a word: ");
		String wordFirst = scan.nextLine();
		System.out.print("Length of the first part: ");
		int first = scan.nextInt();
		System.out.println(wordFirst.substring(0,(first +1)));


	}
}