
package start;
////........Bubble Srot.........///////////////
import java.util.Scanner;

public class Bubble_sort {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[] b = {10,23,45,22,17,54,89,70,47,54};
        
        for (int i = 0; i < b.length; i++) 
        {
            int flag = 0;
            for (int j = 0; j < b.length-1-i; j++) 
            {
                if(b[j] > b[j+1])
                {
                   int temp = b[j];
                       b[j] = b[j+1];
                       b[j+1] = temp;
                       flag  
                               =1;
                }
            }
            if(flag==0)
            {break;}
        }
        
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
}
}
