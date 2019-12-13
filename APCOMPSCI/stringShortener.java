import java.util.Scanner;

public class stringShortener {
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		String shortened = "";
		int vowelCount = 0;
		int repeatCount = 0;
		int x = 0;
		int len;
		System.out.println("Type the message to be shortened: ");
		String message = scan.nextLine();
		message = message.toLowerCase();
		len = message.length();

		if (len < 10){
			System.out.println("This doesn't need shortening!");
		} else {
				while(x < len){
					if	(((message.substring(x,x+1).equals("a"))) ||
						((message.substring(x,x+1).equals("e"))) ||
						((message.substring(x,x+1).equals("i"))) ||
						((message.substring(x,x+1).equals("o"))) ||
						((message.substring(x,x+1).equals("u")))){
						if (x == 0 || message.charAt(x-1) == ' ')
							shortened += message.charAt(x);
						else vowelCount ++;
						x++;
					} else if (x < (len-2) && message.charAt(x) == message.charAt(x+1)){
						repeatCount ++;
						x++;
					} else{
						shortened += message.charAt(x);
						x++;
					}
				}
				System.out.println("\nShortened message: " + shortened);
				System.out.println("Repeated letters removed: " + repeatCount);
				System.out.println("Vowels removed: " + vowelCount);
				System.out.println("Total characters saved: " + (repeatCount + vowelCount));
			}

	}
}