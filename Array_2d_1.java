/*
          Array 2D 1
 */
package start;

import java.util.Scanner;


public class Array_2d_1 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][3];
        
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                num[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                System.out.print(" "+num[row][col]);
            }
            System.out.println();
        }
    }
}
