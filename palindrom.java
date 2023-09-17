/*
       Palindrom 121,232,434 etc
 */
package start;
  import java.util.Scanner;
public class palindrom 
{
   public static void main(String[] args)
   {
       System.out.print("Enter any number: "); 
       Scanner i =new Scanner(System.in);
      int n = i.nextInt();   
      int r, temp = n, sum = 0;
        
      while(temp!=0)
      {
        r = temp%10;
        sum = sum*10 + r;
        temp /= 10;
      }
      if(sum==n){System.out.println("It's a Palindrom number");}     
       
     else{System.out.println("It's not a Palindrom number");}  
   }
}
