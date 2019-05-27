import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
    
      for(int idx = 0; idx < arr_size ; idx++)
      {
         arr[idx] = in.nextInt();
      }
      int search1=in.nextInt();
      int search2=in.nextInt();
      int match1=0;
      int match2=0;
      int val1,val2;
      for(int idx=0;idx<arr_size;idx++)
      {
          if(arr[idx]==search1)
        {
          match1=1;
         // val1=arr[idx];
          System.out.println(idx);
          break;
        }
      }
        for(int idx=0;idx<arr_size;idx++)
        {
          if(arr[idx]==search2)
         {
          match2=1;
         // val2=arr[idx];
          System.out.println(idx);
          break;
         }
        }
      
      if(match1==0){
      System.out.println("-1");}
      if(match2==0){
          System.out.println("-1");}
      }
      
      
        }
      

      
    
