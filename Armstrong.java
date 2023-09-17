/*
        Armstromg
 */
package start;

import java.util.Scanner;

public class Armstrong {
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any valur: ");
        int n = input.nextInt();
        int temp = n, sum = 0;
          
       while(temp!=0)
        {
            int r = temp%10;
            sum = sum + r*r*r;
            temp = temp/10;
        }
         
            if(sum==n)
            {System.out.println("It is a  Armstromg number");}
         else 
            {System.out.println("It is not a Armstromg number");}
    }   
}
