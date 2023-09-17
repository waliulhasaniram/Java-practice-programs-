/*
    sortin number using array
 */
package start;

import java.util.Arrays;
import java.util.Scanner;

public class SORTarray {
    public static void main(String[] args){
      
        Scanner input = new Scanner(System.in);  
        int[] sort = new int[5];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 5; i++) {
            sort[i] = input.nextInt();
        }
        
        Arrays.sort(sort);
        
        System.out.print("Ascending numbers: ");  //Ascending order
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+sort[i]);
        }
        System.out.println();
        
        System.out.print("Descending numbers: ");  //Descending order
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+sort[i]);
        }
        
        System.out.println();
        
        String[] s = {"a","f","h","w","r","b"} ;
        System.out.println("Ascending strings: ");  //Ascending strings
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+s[i]);
        }
        
        System.out.println();
        
        System.out.println("Descending strings: ");  //Descending strings
        for (int i = 5; i >= 0; i--) {
            System.out.print(" "+s[i]);
        }
    }
  
}
