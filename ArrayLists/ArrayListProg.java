import java.util.*;


public class ArrayListProg {
	//Excersise 5
	public static int countItems(ArrayList <String> list){	return list.size();	}
	//Excersise 6
	public static void removeLast(ArrayList&lt;String&gt; list),

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

		//Excersise 02:
		ArrayList <String> words = new ArrayList <String> ();
    	boolean twice = false;
    	while (!twice){
    		System.out.println("Type a word:");
    		String word = scan.nextLine();
    		if (words.contains(word)){ twice = true; System.out.print("You gave the word " + word + " twice.");}
    		else words.add(word);
    	}

		//Excersise 03:
		ArrayList <String> words = new ArrayList <String> ();
    	boolean full = true;
    	while (full){
    		System.out.println("Type a word:");
    		String word = scan.nextLine();
    		if (word.isEmpty())	full = false;
    		else words.add(word);
    	}
		Collections.reverse(words);
    	System.out.println("You typed the following words: ");
		for (String word : words){ System.out.println(word); }

		//Excersise 04:
		ArrayList <String> words = new ArrayList <String> ();
    	boolean full = true;
    	while (full){
    		System.out.println("Type a word:");
    		String word = scan.nextLine();
    		if (word.isEmpty())	full = false;
    		else words.add(word);
    	}
		Collections.reverse(words);
    	System.out.println("You typed the following words: ");
		for (String word : words){ System.out.println(word); }
		*/

		//Excersise 05: **See line 5 for method**
		ArrayList <String> words = new ArrayList <String> ();
		boolean full = true;
    	while (full){
    		System.out.println("Type a word:");
    		String word = scan.nextLine();
    		if (word.isEmpty())	full = false;
    		else words.add(word);
    	}

    	System.out.print("There are this many items in the list: ");
    	System.out.print(countItems(words));

    }




}