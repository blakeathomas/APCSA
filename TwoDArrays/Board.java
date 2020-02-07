/**
 * @(#)Text1.java
 *
 *
 * @author
 * @version 1.00 2020/2/6
 */

import java.util.Arrays;

public class Board {
	private char [][] squares;

    public Board(){
    	char squares = new char [10][10];
		   for (int i = 0; i<10; i++){
		   		for (int j = 0; j<10; j++){
		   			squares[i][j] = '-';
		   		}
		   }
	}

	public String toString(){
		String conversion  = "";
		for (int i = 0; i<10; i++){
		   		for (int j = 0; j<10; j++){
		   			conversion += squares[i][j];
		   		}
		   		conversion += "\n";
		   }
		return conversion;
	}
}