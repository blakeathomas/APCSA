import java.util.*;

public class Die{
	private int value;

	public Die(){
		value = 1;
	}
	public void roll(){
		value = (int)(Math.random() * 6)+1;
	}
	public int getValue(){
		return value;
	}
	public String toString(){
		String stringInt = "";
		stringInt =  ""+value;
		return stringInt;
	}
}