/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    for(int i=1;i<=num;i++){
        if(i%3==0){
          System.out.print(i+",");
        }
        else
          System.out.print(i);
    }
  }
}
