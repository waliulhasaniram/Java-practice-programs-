
package start;

import java.util.Scanner;

public class toStrimg_paresIFD {
 
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        int a_num = 4;/// Integer to string
        String s = Integer.toString(a_num); 
        System.out.println("Integer Converted to string: "+s);
        
        double d1 = 23.44;// double to string
        String s4 = Double.toString(d1);
        System.out.println("double Converted to string: "+s4);
        
        String s1 = "12";// string to integer
        int i = Integer.parseInt(s1);
        System.out.println("string Converted to integer: "+i);
        
        String s2 = "12.3";// string to float
        float f = Float.parseFloat(s2);
        System.out.println("string Converted to flaot: "+f);
        
        String s3 = "12.334";// string to double
        double d = Double.parseDouble(s3);
        System.out.println("string Converted to double: "+d);
////////////////////////////////////////////////////////////////////////////////

    ////.......Binsry, octal, hexadecimal to Decimal..........//// 
      
     String binary = "10101010";
     Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("binary to decimal: "+decimal);
    
     String octal = "10";
     Integer decimal_1 = Integer.parseInt(octal, 8);
        System.out.println("octal to decimal: "+decimal_1);
      
     String Headecimal = "AF";
     Integer decimal_2 = Integer.parseInt(Headecimal, 16);
        System.out.println("Headecimal to decimal: "+decimal_2);
        
    ///////....Deciaml, hexadeciaml.octal to Binary ...////

        int a = 34;
    String bin = Integer.toBinaryString(a);
        System.out.println("Decimal to binary: "+bin);
    
        double b = 34;
    String bin1 = Double.toHexString(b);
        System.out.println("Decimal to binary: "+bin1);
    
}     
}