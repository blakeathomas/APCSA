import Java.util.*;

public class nestedForLoops{
	public static void main (String[] args){
		System.out.println("1. ");
		for (int i = 0; i<=5; i++){
			for (int j = 0; j< i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("2. ");
		for (int i = 0; i<=5; i++){
			for (int j = 5; j> i; j--){
				System.out.print(" ");
			}
			for (int j = 0; j< i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("3. ");
		for (int i = 1; i<=4; i++){
			for (int j = 3; j>= i; j--){
				System.out.print(" ");
			}
			for (int x = 1; x<=(2*i)-1; x++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public class getTable(int multiple){

			for (int i = 1; i <= multiple; i++){
				for (int j = 1; j<= multiple; j++){
					System.out.print((i*j)+"\t");
				}
				System.out.println();
			}
	}
}
