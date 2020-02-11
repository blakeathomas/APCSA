import java.util.*;
public class DieMain{
	public static void main (String[] args){
		Scanner scan  = new Scanner (System.in);
		int rolls = 0;
		//int valueInt = 0;
		System.out.print ("How many rolls would you like? ");
		rolls = scan.nextInt();
		System.out.println("Roll\tValue");
		Die value = new Die();
		for (int i = 1; i<rolls+1; i++){
			value.roll();
			System.out.println(i + "\t\t" + value.getValue());
		}
	}
}
