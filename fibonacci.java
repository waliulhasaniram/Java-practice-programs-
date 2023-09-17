/*
   Fibonacci Number
*/
package start;

 import java.util.Scanner;

public class fibonacci{

    public static void main(String[] args){
        System.out.print("Enter any range: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1, ans;
        
        System.out.print(0 + " ");
        System.out.print(1 + " "); 
         for(int i=0;i<=n;i++){
            ans = a + b; 
             System.out.print(ans + " ");
            a = b;
            b = ans;
        }
    }
}
