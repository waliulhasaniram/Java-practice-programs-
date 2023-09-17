
package start;

import java.util.Scanner;


public class Selection_sort {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] s = {36,71,14,34,3,15,44};
        
        for (int i = 0; i < s.length; i++) 
        {
            int min = i;
            for (int j = i+1; j < s.length; j++)
            {
                if(s[j]<s[min])
                {
                   min=j;
                }
            }
            int temp = s[i];
             s[i] = s[min];
             s[min] = temp;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
