import java.util.Scanner;

public class mini_String_Problems {
	public static void main (String [] args){
		Scanner reader = new Scanner (System.in);
		//Excersise One
		System.out.print("Type your name: ");
		String nameLen = reader.nextLine();
		System.out.print("Number of characters: " + nameLen.length());

		//Excersise Two
		System.out.print("\nType your name: ");
		String nameFirstChar = reader.nextLine();
		System.out.print("Number of characters: " + nameFirstChar.charAt(0));

		//Excersise Three
		System.out.print("\nType your name: ");
		String nameLastChar = reader.nextLine();
		System.out.print("Number of characters: " + nameLastChar.charAt((nameLastChar.length()) - 1));

		//Excersise Four
		System.out.print("\nType your name: ");
		String nameFirstThreeChar = reader.nextLine();
		if (nameFirstThreeChar.length() >= 3){
			System.out.println("1. character: " + nameLastChar.charAt(0));
			System.out.println("2. character: " + nameLastChar.charAt(1));
			System.out.println("3. character: " + nameLastChar.charAt(2));
		}

		//Excersise Five
		System.out.print("\nType your name: ");
		String nameSeperateChar = reader.nextLine();
		int x = 0;
		while (x < nameSeperateChar.length()){
			System.out.println((x+1) +". character: " + nameSeperateChar.charAt(x));
			x++;
		}

		//Excersise Six
		System.out.print("\nType your name: ");
		String nameReverse = reader.nextLine();
		x = (nameReverse.length() - 1);
		System.out.print("In reverse order: ");
		while (x >= 0){
			System.out.print(nameReverse.charAt(x));
			x--;
		}

		//Excersise Seven
		System.out.print("\nType a word: ");
		String wordFirst = reader.nextLine();
		System.out.print("Length of the first part: ");
		int first = reader.nextInt();
		//consumer
		reader.nextLine();
		System.out.println(wordFirst.substring(0,(first)));

		//Excersise Eight
		System.out.print("\nType a word: ");
		String wordEnd = reader.nextLine();
		System.out.print("Length of the end part: ");
		int end = reader.nextInt();
		System.out.println(wordEnd.substring(end));


		//Excersise Nine
		System.out.print("Type the first word: ");
		String wordOne = reader.nextLine();
		System.out.print("\nType the second word: ");
		String wordTwo = reader.nextLine();
		int indexCompare = wordOne.indexOf(wordTwo);
		if (indexCompare == -1) {
			System.out.print("\nThe word '" + wordTwo + "' is not found in the word '" + wordOne + "'.");
		} else {
			System.out.print("\nThe word '" + wordTwo + "' is found in the word '" + wordOne + "'.");
		}

		//Excersise Ten
		reverse r1 = new reverse();
		System.out.print("Type in your text: ");
		String text = reader.nextLine();
		System.out.println("In reverse order: " + r1.reverse(text));
	}
}