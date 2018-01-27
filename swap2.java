class swap2
{
	public static void main(String args[])
		{
			int a,b;
			a=10;
			b=20;
			
			System.out.println("The value of a is" +a);
			System.out.println("The value of b is" +b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("The value of a is" +a);
			System.out.println("The value of b is" +b);
		}
}