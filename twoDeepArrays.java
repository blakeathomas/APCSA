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
    	final int NUM_ROWS =3;
	final int NUM_COLS =2;
	int [][] scores = {{100, 200}, {200,300}, {100,100}};
	int colSum =0;
	double numj = 0.0;
	double [] colAverages = new double  [2];

	for (int i = 0; i< NUM_COLS; i++){
		for (int j = 0; j< NUM_ROWS; j++){
			colSum += scores[j][i];
		numj = j *1.0;
		}
		colAverages[i] = colSum / (numj);
		}
		System.out.println(Arrays.toString(colAverages));
    }

}