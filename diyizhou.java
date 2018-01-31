import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
class Fraction
{
	int a;
	int b;
	Fraction(int a,int b)
	{
		for(int i = 2;i <= a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				a = a/i;
				b = b/i;
				i = 1;
			}
		}
		this.a = a;
		this.b = b;
	}
	
	double toDouble()
	{
		return a*1.0/b;
	}
	
	Fraction plus(Fraction r)
	{
		Fraction c = new Fraction(a*r.b+b*r.a,b*r.b);
		return c;
	}
	
	Fraction multiply(Fraction r)
	{
		Fraction c = new Fraction(a*r.a,b*r.b);
		return c;
	}
	
	void print()
	{
		if(a == b)
			System.out.println(1);
		else
			System.out.println(a+"/"+b);
	}
}