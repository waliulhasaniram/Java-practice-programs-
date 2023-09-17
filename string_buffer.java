
package start;

import java.util.Scanner;

public class string_buffer {
    
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    
    System.out.println("Enter any string: ");    
    String s = in.nextLine();
///////////////////////////////////////string buffer/////////////    
    StringBuffer sb = new StringBuffer(s);
    
    sb.append(" "+"Hasan");
    sb.append(" "+"Iram");
        System.out.println(sb);
    sb.delete(1, 4);
        System.out.println(sb);
        
        
    String x1 = "madama";
    StringBuffer y = new StringBuffer(x1);
     
    String x2 = y.reverse().toString();
    
    if(x2.equals(x1)){
        System.out.println("Palindrom");
    }
    else {
      System.out.println("Not Palindrom");
    }
/////////////////////////////////////string builder////////////////////
     System.out.println("Enter a number: ");
       String xd = in.nextLine();
     StringBuilder sd = new StringBuilder(xd);
          
     sd.append("xD");
     sd.append(":3");
     sd.append(123);
     sd.append(123.33);
     
        System.out.println("Builder: "+sd);

    
    }
}
