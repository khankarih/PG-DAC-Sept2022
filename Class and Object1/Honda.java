// 2.Java Program to Illustrates Use of Abstract Class and Method

abstract class Bike
{
	abstract void run();
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Running safely");
	}

	public static void main(String[] args)
	{
		Bike b1=new Honda();
		b1.run();
	}
}
