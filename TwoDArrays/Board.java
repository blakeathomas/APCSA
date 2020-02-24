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
    	squares = new char [10][10];
		   for (int i = 0; i<10; i++){
		   		for (int j = 0; j<9; j++){
		   			squares[i][j] = '-';
		   		}
		   }
	}
	public boolean addShip(int row, int col, int len, boolean horizontal) {
		if (horizontal){
			if((col + len) <= 10){
				for (int i=1; i < len+1; i++){
					squares[col-1][i] = 'b';
				} return true;
			} else return false;
		}	else{


			if((col + len) <= 10){
				for (int i=1; i < len+1; i++){
					squares[i][row-1] = 'b';
				} return true;
			} else return false;
		}
	}

/*	public int shoot(int row, int col) {
		if (squares[row][col])
	}
*/
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