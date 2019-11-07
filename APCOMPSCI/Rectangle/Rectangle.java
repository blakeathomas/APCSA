public class Rectangle
{
	private int length;
	private int width;

	public Rectangle()
	{
		length = 0;
		width = 0;
	}

	public Rectangle(int len, int w)
	{
		length = len;
		width = w;
	}

	public int getPerimeter()
	{
		return 2 * (length + width);
	}

	public int getArea()
	{
		return length * width;
	}

	public void setDimensions(int len, int w)
	{
		length = len;
		width = w;
	}

	public String toString()
	{
		return "Rectangle with length of "
				+ length + " and width of "
				+ width;
	}
}