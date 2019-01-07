class Maths
{
	public static void main (String args[])
	{
	int a,b,c;
	
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	
	
	c=a+b;
		System.out.println("addition is:" + c );
	c=a-b;
		System.out.println("division is:" + c );
	c=a*b;
		System.out.println("multiplication:" + c );
	c=a/b;
		System.out.println("division is:" + c );
	c=a%b;
		System.out.println("mod is:" + c );
	}
}	