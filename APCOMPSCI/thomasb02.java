import java.util.Scanner;

public class thomasb02 {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter in a noun: ");
		String noun1 = scan.nextLine();

		System.out.println("And another noun: ");
		String noun2 = scan.nextLine();

		System.out.println("And yet another noun: ");
		String noun3 = scan.nextLine();

		System.out.println("A verb: ");
		String verb1 = scan.nextLine();

		System.out.println("And another verb: ");
		String verb2 = scan.nextLine();

		System.out.println("And an adjective: ");
		String adj = scan.nextLine();

		System.out.println("You should always wash your " +  noun1 +
		 " before you put it away. Some people do not and then they have to use a "
		 + noun2 + " instead. One " + adj + " " +  noun1 + " is best to use on a " + noun3 +
		 ", otherwise the " + noun3 + " won't " + verb1 + " or " + verb2 + ".");

	}
}