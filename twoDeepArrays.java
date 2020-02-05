/**
 * @(#)twoDeepArrays.java
 *
 *
 * @author
 * @version 1.00 2020/2/4
 */
import java.util.*;

public class twoDeepArrays {

    public static void main(String[] args) {
		int [][] numbers = {{8, 3, 7}, {6, 7, 6}, {0, 0, 1}};
	    final int NUM_ROWS = numbers.length;
		final int NUM_COLS =numbers[0].length;
		int sum = 0;
		int colSum = 0;
		int row = 0;
		for (int i = 0; i< NUM_COLS; i++){
			for (int j = 0; j< NUM_ROWS; j++){
				colSum += numbers[j][i];
				if (colSum > sum){

					row = i;
					sum = colSum;
				}
			}
			colSum = 0;
		}
		System.out.println(row);
    }

}