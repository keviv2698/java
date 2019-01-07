public class logic
{
	public static void main (String args[])
	{
	int a,b,c;
	
	a=60;
	b=13;
	c=0;
	
	c=a&b;
		System.out.println("and  is:" + c );
	c=a|b;
		System.out.println("OR  is:" + c );
	c=a<<2;
		System.out.println("LEFT SHIFT:" + c );
	c=a>>2;
		System.out.println("RIGHT SHIFT :" + c );
	c=b<<2;
		System.out.println("LEFT SHIFT is:" + c );
	c=b>>2;
		System.out.println("RIGHT SHIFT is:" + c );
	}
}	