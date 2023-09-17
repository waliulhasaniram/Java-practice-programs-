
package start;

  import java.util.Scanner;

public class Array_Insert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position and the value");
        int position = in.nextInt();
        int value = in.nextInt();
        int a[] = {12,139,140,155,164,171};
        int i;
        for( i = a.length-1; i > position-1; i--){
           a[i] = a[i-1];
        }
      
        a[i] = value;
        for(int j=0; j<a.length; j++){
            System.out.print(" "+a[j]);
        }
    }
}
