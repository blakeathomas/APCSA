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
		if ((message.length() < 10)){
			System.out.println("This doesn't need shortening!");
		}	else {
				if	(((message.substring(x,x+1).equals("a"))) ||
					((message.substring(x,x+1).equals("b"))) ||
					((message.substring(x,x+1).equals("c"))) ||
					((message.substring(x,x+1).equals("d"))) ||
					((message.substring(x,x+1).equals("e")))){
					vowelCount ++;
					x++;
				}	else if	(message.charAt(x) == message.charAt(x-1)){
					repeatCount ++;
					x++;
					} else	{
						shortened += message.charAt(x);
						x++;
					  }
				}
	}
}