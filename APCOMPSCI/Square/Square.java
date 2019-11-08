/**
 * @(#)Square.java
 *
 *
 * @author
 * @version 1.00 2019/11/7
 */


public class Square {
	private double side;
	private static int count = 0;

    public Square() {
    	side = 1.0;
    	count++;
    }

    public Square (double side){
    	this.side = side;
    	count++;
    }

    public double perimeter(){
    	return side * 4;
    }

    public double area(){
    	return side * 2;
    }

    public int getCount(){
    	return count;
    }

    public void resetCount(){
    	count = 0;
    }
	public String toString(){
	    return "Square = " + side +", Area = " + area() + ", Perimeter = " + perimeter();
	}

}