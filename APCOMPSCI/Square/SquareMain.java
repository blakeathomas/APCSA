/**
 * @(#)SquareMain.java
 *
 *
 * @author
 * @version 1.00 2019/11/7
 */

public class SquareMain {

    public static void main(String[] args) {
	Square s1 = new Square();

	Square s2 = new Square(5);

	System.out.println(s1.getCount());
	System.out.println(s2.toString());

    }
}
