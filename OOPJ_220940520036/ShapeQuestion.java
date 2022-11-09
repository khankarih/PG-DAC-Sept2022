class Shape
{
	double height;
	double width;

	void setValues(double height,double width)
	{
	this.height = height;
	this.width = width;
	}
	 double getHeight()
	{
	return height;
	}

	double getWidth()
	{
	return width;
	}
}

class Rectangle extends Shape
{
	public double getArea()
	{
		return getHeight() * getWidth();
	}
}

class Triangle extends Shape
{
	public double getArea()
	{
		return(getHeight() * getWidth()) / 2;
	}
}


class ShapeQuestion
{
	public static void main(String args[])
	{
		
		Rectangle rect = new Rectangle();
		
		rect.setValues(90,4);
		
		System.out.println("Area of Rect is :: "+rect.getArea()+"square mtr");
		
		Triangle tri = new Triangle();
		
		tri.setValues(8,11);
		
		System.out.println("Area of Traingle is :: "+tri.getArea()+"Sqaure mtr");
	}
}
