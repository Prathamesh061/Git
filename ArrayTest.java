class ArrayTest
{
		public static void main(String args[])
		{
			int n = Integer.parseInt(args[0]);
			int a[];
			a= new int[n];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
			a[4]=5;
			System.out.println("All the element of array are ");
			for(int i=0; i<5; i++)
			{
				System.out.print(a[i]+"  ");
			}		
		}
		
}