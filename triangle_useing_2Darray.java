/*
       /  Make a triangle with numbers usseing array \  
       \ --------------------------------------------/
*/
package start;

import java.util.Scanner;

public class triangle_useing_2Darray {
    
 public static void main(String[] args)
    {
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[][] a = new int[n][];
        for (int i = 0; i < n; i++) {
              a[i] = new int [i+1];
        }

      int k =0;
       
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row+1; col++) {
                a[row][col] = k;
                k++;
            }
        }
         for (int row = 0; row < n; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print(" "+a[row][col]);
            }
             System.out.println();
         }
    }
}
