//7. Java Program to Implement Shape Interface using Circle and Rectangle Class

interface Shape
{
	void calArea();
	void printArea();
}

class Circle implements Shape
{
	int r;
	double area;
	
	Circle(int r)
	{
		this.r=r;
	}
	
	public void calArea()
	{
		area=3.14*r*r;
	}
	
	public void printArea()
	{
		System.out.println("Area of Circle is: "+area);
	}
}

class Rectangle implements Shape
{
	int l;
	int b;
	int area1;
	
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	
	public void calArea()
	{
		area1=l*b;
	}
	
	public void printArea()
	{
		System.out.println("Area of Rectangle is: "+area1);
	}
}
	
class Q7
{
	public static void main(String args[])
	{
		Circle c1=new Circle(5);
		c1.calArea();
		c1.printArea();
		
		Rectangle r1=new Rectangle(5,6);
		r1.calArea();
		r1.printArea();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q7.java

I:\Diwali Assignment\Class and Object>java Q7
Area of Circle is: 78.5
Area of Rectangle is: 30

*/


