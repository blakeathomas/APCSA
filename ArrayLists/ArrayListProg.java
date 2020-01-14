import java.util.*;


public class ArrayListProg {

    public static void main (String[] args) {
    	Scanner scan = new Scanner (System.in);

    /*	//Excersise 01:
    	ArrayList <String> words = new ArrayList <String> ();
    	boolean full = true;
    	while (full){
    		System.out.println("Type a word:");
    		String word = scan.nextLine();
    		if (word.isEmpty())	full = false;
    		else words.add(word);
    	}

    	System.out.println("You typed the following words: ");
		for (String word : words){ System.out.println(word); }
		*/
		//Excersise 02:
		ArrayList <String> words = new ArrayList <String> ();
    	boolean twice = false;
    	while (!twice){
    		System.out.println("Type a word:");
    		String word = scan.nextLine();
    		if (words.contains(word)){ twice = true; System.out.print("You gave the word " + word + " twice.");}
    		else words.add(word);
    	}

    }


}