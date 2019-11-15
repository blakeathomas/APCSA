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
    	return side * side;
    }
    public double side(){
    	return side;
    }

    public static int getCount(){
    	return count;
    }

    public static void resetCount(){
    	count = 0;
    }
    public void setSide(double x){
    	side = x;
    }
	public String toString(){
	    return "Square: Side = " + side +", Area = " + area() + ", Perimeter = " + perimeter();
	}

}