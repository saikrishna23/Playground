import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
        Scanner in=new Scanner(System.in);
    int num=in.nextInt();
       System.out.print(Math.abs((num%100)/10));
  
	}
}