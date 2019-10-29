/** ArtMethodsProg.java

You will create a program that will draw a tower with 6 floors, and then 5 stick figure people.

Example Output:

     **
   *    *
  *      *
 *        *
*          *
************
*          *
*          *
*          *
*          *
************
*          *
*          *
*          *
*          *
************
*          *
*          *
*          *
*          *
************
*          *
*          *
*          *
*          *
************
*          *
*          *
*          *
*          *
************
*          *
*   ****   *
*   *  *   *
*   *  *   *

 O
---
 |
/ \

 O
---
 |
/ \

 O
---
 |
/ \

 O
---
 |
/ \

 O
---
 |
/ \


Process completed.
*/

public class ArtMethodsProg

{

	public static void main(String[] args)
	{
		drawTopFloor();
		drawMiddleFloor(5);
		drawGroundFloor();
		drawPeople(5);


		// call the method to draw the middle floor 5 times
		// (bonus create a method that calls the middle floor
		//  with a loop 5 times).



		//call the method to draw the ground floor


		//call the method to draw 5 people by passing it a parameter


	} // end of main


	////////////////////////////////////////////////


	public static void drawGroundFloor()
	{
		System.out.println("*          *");
		System.out.println("*   ****   *");
		System.out.println("*   *  *   *");
		System.out.println("*   *  *   *");

	} // end of drawGroundFloor


	////////////////////////////////////////////////


	public static void drawTopFloor()
	{
		System.out.println("     **     ");
		System.out.println("   *    *   ");
		System.out.println("  *      *  ");
		System.out.println(" *        * ");
		System.out.println("*          *");
		System.out.println("************");

	} // end of drawTopFloor


	////////////////////////////////////////////////


	public static void drawMiddleFloor(int num)
	{
		int y = 1;
		while (y <= num){
		System.out.println("*          *");
		System.out.println("*          *");
		System.out.println("*          *");
		System.out.println("*          *");
		System.out.println("************");
		y++;
		}
	} // end of drawMiddleFloor


	////////////////////////////////////////////////


	public static void drawPeople(int num)
	{
		int x = 1;
		while (x <= num){
		System.out.println(" o ");
		System.out.println("---");
		System.out.println(" | ");
		System.out.println("/ \\\n");
		x++;
		}
	} // end of drawPeople

}