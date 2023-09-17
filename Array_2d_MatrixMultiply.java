/*
        Array 2d Matrix Multiply
 */
package start;

import java.util.Scanner;
public class Array_2d_MatrixMultiply {
    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
       int[][] A = new int[3][3];  
       int[][] B = new int[3][3];
       int[][] c = new int[3][3];
         
//Taking input for A matrix...................
        System.out.println("Enter elements for A matrix: ");
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = input.nextInt();
            }
        }
//Taking input for B matrix...................................
        System.out.println("Enter elements for B matrix: ");
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
            }
        }
 
//Printing A matrix................................
     System.out.println("A = ");
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                System.out.print(" "+A[row][col]);
               
            }
            System.out.println();
        }
 //Printing B matrix.............................
     System.out.println("B = ");
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                System.out.print(" "+B[row][col]);
               
            }
            System.out.println();  
        }    
///Multiplying of A and B...........................    
        System.out.println("A * B = ");
         for (int row = 0; row < 3; row++) 
         {
            for (int col = 0; col < 3; col++) 
            {
               int sum = 0;
                for (int i = 0; i < 3; i++) 
                {
                    sum = sum + A[row][i] * B[i][col];
                     c[row][col] = sum;
                }
                
            }
             System.out.println();       
         }
           
    }
}

