/*
             ARRAY 1
 */
package start;
  import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] num = new int[5];
        System.out.println("Enter the value of the array: ");
        for (int i = 0; i < 5; i++) {
            num[i] = input.nextInt();
        }
         int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + num[i];
        }
        
      System.out.printf("SUM = %d\n",sum);
        System.out.printf("Avrage = %.2f\n",(double)sum/5);
        
      int size = num.length;
        System.out.println("Size of the array is: "+size);
        
        // maximum and minimum
        int max = num[0];
        for (int i = 1; i < 5; i++) {
            if(max<num[i])
            {max = num[i];}
        }
        
        int min = num[0];
        for (int i = 1; i < 5; i++) {
            if(min>num[i])
            {min = num[i];}
        }
        
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    } 
}
