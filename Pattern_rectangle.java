/*
   rectangle using pattern
   triangle using pattern
   cross using pattern
 */
package start;

import java.util.Scanner;

public class Pattern_rectangle {
    
   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = in.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row==1 || row==n || col==1 || col==n)
                    {System.out.print("#");}
                else
                    {System.out.print(" ");}
            }
            System.out.println("");
        }
        
     /*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
      
        System.out.println("Enter any number: ");
        int m = in.nextInt();
        
        for (int row =1; row <= m; row++) {
            for (int col = 1; col <= m; col++) {
                if(row==n || col==1 || col==row)
                    {System.out.print("&");}
                else
                    {System.out.print(" ");}
            }
            System.out.println("");
        }
     /*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
     
     System.out.println("Enter any number: ");
        int p = in.nextInt();
        
        for (int row =1; row <= p; row++) {
            for (int col = 1; col <= p; col++) {
                if(row==col || row+col == p+1)
                    {System.out.print("*");}
                else
                    {System.out.print(" ");}
            }
            System.out.println("");
        }
    }
}
