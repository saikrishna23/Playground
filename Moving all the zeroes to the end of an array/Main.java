import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      int b[] = new int[n];
      for(int i=0;i<n;i++)
         a[i] = sc.nextInt();
      int j=0;
      for(int i=0;i<n;i++)
        if(a[i]!=0) b[j++]=a[i];
      for(int i=j;i<n;i++)
        b[j++]=0;
      for(int i=0;i<n;i++) System.out.print(b[i]+" ");
    }
}