import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        int i,j,k,num;
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      for(i=1;i<=num;i++){
        k=num-i+1;
        for(j=num;j>=i;j--){
            System.out.print(k);
            k--;
        }
        System.out.println();
      }
	}
}