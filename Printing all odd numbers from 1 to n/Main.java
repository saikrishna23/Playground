import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int number, i;
		 Scanner in=new Scanner(System.in);
		number = in.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i +"\n"); 
			}
		}	
	}
}