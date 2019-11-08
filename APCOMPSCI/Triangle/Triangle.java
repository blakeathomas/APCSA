/**
 * @(#)Triangle.java
 *
 * Triangle application
 *
 * @author
 * @version 1.00 2019/11/6
 */

public class Triangle {

	private double base;
	private double height;

	public Triangle(){
		base = 0.0;
		height = 0.0;
	}

	public Triangle(double x, double y){
		base = x;
		height = y;
	}

	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}

	public void setBase(double x){
		base = x;
	}
	public void setHeight(double y){
		height = y;
	}

	public double area(){
		return ((base*height)/2);
	}

	public String toString(){
		return "Triangle: Base: " + base + ", Height: " + height + ", Area: " + area();
	}
 }
