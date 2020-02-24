import java.util.Scanner;

public class DiceMain {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Dice result = new Dice();
		int rolls = 0;
		System.out.print("How many rolls? ");
		rolls = scan.nextInt();
		System.out.println("Roll\tResult");
		for (int i = 0; i < rolls; i++){
			result.rollDice();
			System.out.println(i + "\t\t" + result.getValue() + " " + result);
		}

	}
}