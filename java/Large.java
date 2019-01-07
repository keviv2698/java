class Large
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("greatest number one:");
		a=Integer.parseInt(args[0]);
		System.out.println("greatest number two:");
		b=Integer.parseInt(args[1]);
		System.out.println("greatest number three:");
		c=Integer.parseInt(args[2]);
		
		if(a>b)
		{
			if(a>c)
			{
			System.out.println("greatest number is:" + a);
			}
		
		}
		else if(b>c) 
		{	
		
			System.out.println("greatest number is:" + b);
		}	
		else
		{
			System.out.println("greatest number is:" + c);
		}
	}

}	