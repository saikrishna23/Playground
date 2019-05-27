import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       int sum = num%10;
       int temp=0;
       while(num > 0){
         temp=num%10; 
         num/=10;
       }
      sum+=temp;
      System.out.println(sum);
	}
}