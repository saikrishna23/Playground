import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
        int i,j;
        int num=in.nextInt();
        int k=0;
        char a;
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++){
              if(k%2==0){
               a='*';
            }else
               a='#';
                System.out.print(a);
              k++;
            }
            System.out.println();
        }
           
    }
}