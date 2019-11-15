/**
 * @(#)SquareMain.java
 *
 *
 * @author
 * @version 1.00 2019/11/7
 */

public class SquareMain {

    public static void main(String[] args) {
    System.out.println("Count = " + Square.getCount());
	Square s1 = new Square();
	Square s2 = new Square(5);
	System.out.println("Count = " + Square.getCount());
	System.out.println(s2.toString());
	s2.setSide(6);
	System.out.println("\nSide = " + s2.side());
	System.out.println("Area = " + s2.area());
	System.out.println("Perimeter = " + s2.perimeter());
	s2.resetCount();
	System.out.println("\nCount = " + s2.getCount());


    }
}
