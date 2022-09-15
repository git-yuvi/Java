import java.util.*;

abstract class shape
{
	abstract void area();
}

class square extends shape
{

	float a;
	square(float b)
	{
	  a=b;
	}
	void area()
	{
 	  System.out.println("Area of a square= "+(a*a));
 	}
}
class rectangle extends shape
{
	float l,b;
	rectangle(float x,float y)
	{
	  l=x;
	  b=y;
	}
	void area()
	{
	  System.out.println("Area of rectangle= "+(l*b));
	}
}

class abstract1
{
	public static void main(String args[])
	{
	Scanner ds=new Scanner(System.in);
	System.out.print("Enter a : ");
	float a=ds.nextFloat();
	square s=new square(a);
	s.area();

	System.out.print("Enter l: ");
	 float l=ds.nextFloat();
	System.out.print("Enter b: ");
	 float b=ds.nextFloat();
	rectangle r=new rectangle(l,b);
	r.area();
	}
}
