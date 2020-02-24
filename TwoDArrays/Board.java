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
		   		for (int j = 0; j<10; j++){
		   			squares[i][j] = '-';
		   		}
		   }
	}
	public boolean addShip(int row, int col, int len, boolean horizontal) {
		if (horizontal){
			if((col + len) <= 10){
				for (int i=0; i < len; i++){
					squares[row-1][i] = 'b';
				} return true;
			} else return false;
		}
		else{
			if((col + len) <= 10){
				for (int i=0; i < len; i++){
					squares[(row+i)-1][col-1] = 'b';
				} return true;
			} else return false;
		}
	}

	public int shoot (int row, int col){
		if (row > 10 || col > 10)
			return -1;
			else if (squares[row-1][col-1] == '-'){
				squares[row-1][col-1] = 'm';
				return 0;
			}	else if (squares[row-1][col-1] == 'b'){
				squares[row-1][col-1] = 'x';
				return 1;
				}	else return 2;
	}
	public boolean gameOver(){
		for (int i = 0; i<10; i++){
		   		for (int j = 0; j<10; j++){
		   		if (squares[i][j] == 'b')
		   			return false;
		   		}
		   }
		   return true;
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