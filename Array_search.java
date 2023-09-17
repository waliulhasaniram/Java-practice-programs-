
package start;

import java.util.Scanner;

public class Array_search {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a[] = new int [5];
        System.out.println("Enter array");
    for(int j = 0; j<5; j++){
     a[j] = input.nextInt();
    }
     
     System.out.println("Enter the value you want to search: ");
     int v = input.nextInt();
     
     for(int j=0; j<a.length; j++){
         if( v == a[j]){
            System.out.printf("found at position %d",j+1);
             break;
         }
         
     }

    
    }
 
}
