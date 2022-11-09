/*
Question 3:
Q3: Write a Java Program to implement the given inheritance with Shape is super class for Rectangle and Triangle class with 
getArea() to calculate the area of rectangle and triangle.*/


class Shape
{
	double height;
	double width;
	
	void setValues(double height,double width)
	{
		this.height=height;
		this.width=width;
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
	double getAreaRectangle()
	{
		double area=height*width;
		return area;
	}
}

class Triangle extends Shape
{
	double getAreaTriangle()
	{
		double area=0.5*height*width;
		return area;
	}
}

class Area
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		r1.setValues(5.0,6.0);
		double r=r1.getAreaRectangle();
		System.out.println("Area of Rectangle is:"+r);
		
		Triangle t1=new Triangle();
		t1.setValues(8.0,9.0);
		System.out.println("Area of Triangle is:"+t1.getAreaTriangle());
	}
}

/*
O/P:

I:\OOPJ_220940520036>javac Area.java

I:\OOPJ_220940520036>java Area
Area of Rectangle is:30.0
Area of Triangle is:36.0
*/	