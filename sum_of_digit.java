/*
     Sum of digits 
 */
package start;

 import java.util.Scanner;

public class sum_of_digit {
    
    public static void main(String[] args){
      
        System.out.println("Enter any number:");
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int temp, r, sum = 0;
        temp = n;
        while(temp!=0)
        {
          r = temp % 10;
          sum = sum + r;
          temp = temp / 10;
        }
        System.out.printf("Sum of degits: %d",sum);
        System.out.println();
    }
}