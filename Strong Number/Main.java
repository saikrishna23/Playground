import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int factorial,i,sum=0,reminder;
      while(temp>0)
      {
       factorial = 1; 
			i = 1; 
         reminder = temp % 10;
		    while (i <= reminder)
		    {
		     	factorial = factorial * i;
		     	i++;
		    }
         sum = sum + factorial;
		     temp = temp /10;
		}
      if ( n == sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}