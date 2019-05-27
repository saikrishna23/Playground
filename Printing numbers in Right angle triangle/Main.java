import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i,j,num;
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      for(i=1;i<=num;i++){
        for(j=1;j<=i;j++){
          System.out.print(i);
        }
        System.out.println();
      }
	}
}