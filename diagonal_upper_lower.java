/*
       Diagonal, Upper triangle, Lower triangle 
 */
package start;

   import java.util.Scanner;

public class diagonal_upper_lower 
{
    public static void main(String[] args)
    {
      int sum1 =0,sum2 = 0, sum3 = 0; 
        Scanner i = new Scanner(System.in);
         int[][] a = new int[3][3];
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                a[row][col] = i.nextInt();
                
                if(row==col){sum1 = sum1 + a[row][col];}
                
                if(row<col){sum2 = sum2 + a[row][col];}
                
                if(row>col){sum3 = sum3 + a[row][col];}
            }
        }
   
        System.out.println("sum of diagonal triangle: "+sum1);    
        System.out.println("sum of upper triangle: "+sum2);    
        System.out.println("sum of lower triangle: "+sum3);    
    }
}
