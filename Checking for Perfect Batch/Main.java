import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = sc.nextInt();
    }
     int sum=0,prev=0; 
      boolean fl=false;
      
      prev= list[0]+list[1]+list[2];
     for(int i=3;i<n;i++){
       if(i%3==0 && i!=3){
         if(sum!=prev){
           fl=false;
           break;
         }
         sum=list[i];
         fl=true;
       }
       sum+=list[i];
     }
     if(fl==true)
       System.out.println("Perfect Batch");
      else
        System.out.println("Not a Perfect Batch");
         
   }
}