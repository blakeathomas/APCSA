public class RectangleDriver {
	public static void main (String [] args) {

		Rectangle rect1 = new Rectangle();
		System.out.println(rect1);

		Rectangle r2 = new Rectangle(6,12);
		System.out.println(r2);

		Rectangle r3 = new Rectangle ();
		System.out.println(r3);

		rect1.setDimensions(2,4);
		r2.setDimensions(5,9);

		System.out.println("rect1 now: " + rect1);
		System.out.println("r2 now: " + r2);
		System.out.println(rect1.getPerimeter());
		System.out.println(rect1.getArea());
		System.out.println(rect1.length);
		System.out.println(rect1.width);



	}
}