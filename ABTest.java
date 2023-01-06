//Inheritance (Reusability)
class A
{
	private int a;
	public  int b;
	int c;	
}
class B extends A
{
	
	
}
class ABTest
{
	public static void main(String args[])
	{
		B b1 = new B();
		
		//b1.a=10;  //error occurs can't access private varibles
		
		b1.c=30;
		b1.b=20;
	
		//System.out.println("A = "+b1.a); //error occurs
		System.out.println("B = "+b1.b);
		System.out.println("C = "+b1.c);
	}
}