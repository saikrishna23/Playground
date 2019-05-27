import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       int n,i,j,k,t;
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       for(i=1;i<=n;i++){
         t = 2*i-1;
         k = 2*n-1 - t;
         k/=2;
         for(j=1;j<=k;j++)
           System.out.print(" ");
         for(j=1;j<=t;j++){
           System.out.print("*");
         }
         for(j=1;j<=k;j++)
           System.out.print(" ");
         System.out.println();
       }
	}
}