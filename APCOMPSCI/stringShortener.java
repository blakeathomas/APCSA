import java.util.Scanner;

public class stringShortener {
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		String shortened = "";
		int vowelCount = 0;
		int repeatCount = 0;
		int x = 0;
		System.out.println("Type the message to be shortened: ");
		String message = scan.nextLine();

	//System.out.println(message.length());
		if ((message.length() < 0)){
			System.out.println("This doesn't need shortening!");
		} else {
				while(x < (message.length()-1)){
					if	(((message.substring(x,x+1).equals("a"))) ||
						((message.substring(x,x+1).equals("e"))) ||
						((message.substring(x,x+1).equals("i"))) ||
						((message.substring(x,x+1).equals("o"))) ||
						((message.substring(x,x+1).equals("u ")))){
						vowelCount ++;
						System.out.print(message.charAt(x) + "  " + x);
						x++;
						} else if (message.charAt(x) == message.charAt(x+1)){
							repeatCount ++;
							System.out.print(message.charAt(x) + "  " + x);
							x++;
							} else	{
								shortened += message.charAt(x);
								System.out.print(message.charAt(x) + "  " + x);
								x++;

							  }
						}
		System.out.println(shortened);
		System.out.println(x);
		System.out.println(vowelCount);
	}
}
}