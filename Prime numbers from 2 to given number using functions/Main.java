import java.util.Scanner;

 class Main
{
	public static void main(String args[])
	{
	
		int s1, s2,count = 0, i, j;
		Scanner s = new Scanner(System.in);
		
		s1 = 1;
		
		s2 = s.nextInt();
     System.out.println("2");
	

		for(i = s1; i <= s2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}