/*
             Reverse a number
*/
package start;

import java.util.Scanner;

public class reverse_a_number {
  
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter any number to reverse it: ");
       int n = input.nextInt();
       int r, temp, sum = 0;
       temp = n;
       
       while(temp!=0){
        r = temp % 10;
        sum = sum*10 + r;
        temp = temp / 10;
       } 
       System.out.printf("Reverse: %d",sum);
   }
}