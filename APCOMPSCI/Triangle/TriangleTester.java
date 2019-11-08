public class TriangleTester {

	public static void main(String[] args) {

		Triangle t1 = new Triangle();
		System.out.println("Should print: Triangle: Base = 0.0, Height = 0.0, Area = 0.0");
		System.out.println("Actually prints: " + t1);

		Triangle t2 = new Triangle(2.5, 4);
		System.out.println("\nShould print: Triangle: Base = 2.5, Height = 4.0, Area = 5.0");
		System.out.println("Actually prints: " + t2);

		t1.setBase(8);
		t1.setHeight(2.5);
		System.out.println("\nBase = 8.0 : " + t1.getBase());
		System.out.println("Height = 2.5 : " + t1.getHeight());
		System.out.println("Area = 10.0 : " + t1.area());
	}

}