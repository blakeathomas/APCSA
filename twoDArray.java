import java.utils. *;

public static void class twoDArray{
	final int NUM_ROWS =3;
	final int NUM_COLS =2;
	int [][] scores = {{100, 200}, {200,300}, {100,100}};
	int colSum =0;
	double [] colAverages = new double  [2];

	for (int i = 0; i<= NUM_COLS; i++){
		for (int j = 0; j<= NUM_ROWS; j++){
			colSum += scores[j][i];
		}
		colAverages[i] = colSum / (j*1.0);
		}