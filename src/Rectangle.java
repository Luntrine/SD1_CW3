public class Rectangle {
	
	
    /* The program declares private doubles width and height which 
    will then be declared inside of the constructors. */
	private double width;
	private double height;
	
	/* The following is a no-argument constructor which creates
    a Rectangle object with a height of 1 and a width of 1. */
	public Rectangle() 
	{
		width = 1;
		height = 1;
	}
	
	/* The following is a two-argument constructor which creates
    a Rectangle object with a height of inputHeight and a width of inputWidth. */
	public Rectangle(double inputWidth, double inputHeight)
	{
		width = inputWidth;
		height = inputHeight;
	}
	
	// The following is a method which returns the private double width.
	public double getWidth()
	{
		return width;
	}
	
	// The following is a method which returns the private double height.
	public double getHeight()
	{
		return height;
	}
	
	/* The following is a method which returns the 
	area of the rectangle object in question. */
	public double getArea()
	{
		return width * height;
	}
	
	/* The following is a method which returns the 
	perimeter of the rectangle object in question. */
	public double getPerimeter()
	{
		return width + width + height + height;
	}
	
}
