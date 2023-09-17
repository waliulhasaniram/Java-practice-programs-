/*
        Array (for each loop)
 */
package start;

import java.util.Scanner;


public class Array_for_each_loop {
    
    public static void main(String[] args)
    {
      
       String[] names = {"iram","i","r","a","m"};
       
       
        for (String n : names) {
            System.out.println(n);
        }
        
////////////////////////////////////////////////////////////////////
        int[] num = {1,2,3,4};
        int sum = 0;
         for (int x : num) {
             sum = sum+x;           
        }
         
         System.out.println("sum : "+sum);
         System.out.println("avrage : "+(double)sum/4);
         
///////////////////////////////////////////////////////////////////////

    Scanner input = new Scanner(System.in);
    int[] a = new int[4];
    int s = 0;
        for (int y : a) {
            a[y] = input.nextInt();
            for (int z : a) {
                s = s + z;
            }
        }
        System.out.println("sum = "+s);
        System.out.println("avrage : "+(double)s/4);      

    }
}
