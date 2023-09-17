
package start;

import java.util.Scanner;

public class Start {

  
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter any value to make a triangle: ");
      int n = input.nextInt();
      
      for(int row=0; row<=n; row++)//upper part
      { for(int col=0; col<=row; col++)
         {
             System.out.print(col);
         }
          System.out.println("");
      }
     
      for(int row=n-1; row>=0;row--)
      { for(int col=0; col<=row; col++)
        {
          System.out.print(col);
        }
          System.out.println("");
      }
    
     for(int row=1; row<=n; row++)//upper part
      { for(int col=0; col<=row; col++)
         {
             System.out.print(row);
         }
          System.out.println("");
      }
     
      for(int row=n-1; row>=0;row--)
      { for(int col=0; col<=row; col++)
        {
          System.out.print(row);
        }
          System.out.println("");
      }
    }
}
