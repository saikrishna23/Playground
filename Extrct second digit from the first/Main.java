import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here      
       Scanner in = new Scanner(System.in);
       int temp = 0;
       int num = in.nextInt();
       while(num > 10){
         temp = num%10;
         num/=10;
       }
      System.out.println(temp);
       
    }
}
	
