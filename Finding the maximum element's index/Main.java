import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int max=0;
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      if(a[i]>a[max])
        max=i;
    }
    System.out.println(max);
    
    
  }
}