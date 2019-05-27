import java.util.Scanner;
class Main{
  public static int sum_num(int m)
  {
    int i,sum=0;
    for(i=1;i<=m;i++)
    {
     sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum_of_digit=sum_num(n);
      System.out.println(sum_of_digit);
	}
}