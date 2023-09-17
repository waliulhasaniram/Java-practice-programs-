/*
    Array list
 */
package start;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    
    public static void main(String[] args) {
 
    ArrayList<Integer> num = new ArrayList<Integer>();
     
      num.add(10);//0
      num.add(20);//1
      num.add(30);//2
      num.add(40);//3
      num.add(50);//4
      num.add(5,60);//4 //adding 60 in index 5
      System.out.println("The siza of the array list: "+num.size());    
      System.out.println("Before removing inder 0 : "+num);
      
      num.remove(0);
        System.out.println(" After removing inder 0: "+num);
        
        System.out.print("Printing using for each loop:  ");
        for(int x : num) {
            System.out.print(" "+x);
        }
        System.out.println("");
        
        Iterator it = num.iterator();
        System.out.print("Printing using Iterator: ");
      while(it.hasNext())
      {
          System.out.print(" "+it.next());
      }
       System.out.println("");
       
    //////////////////////////////////////////////////////////////
    
    boolean ck = num.isEmpty();
        System.out.println("The arraylist is empty,is it true or false: "+ck);
        
    boolean ckn = num.contains(100);
        System.out.println("Does arraylist contains 100: "+ckn);  
   
    int ind = num.indexOf(20);
        System.out.println("The index number of 20 is: "+ind);
    
    System.out.println("Before setting 10 at index 6: "+num);   
    int set = num.set(0, 10);//replace
        System.out.println("After setting 10 at index 6: "+num);
        
    int pos = num.get(4);//4th index value
        System.out.println("4th Index contains: "+pos);
    ////////////////////////////////////////////////////////////////
    
    ArrayList<Integer> num1 = new  ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
    ArrayList<Integer> num2 = new  ArrayList<Integer>();
        num2.add(6);
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(10);  
    ArrayList<Integer> num3 = new  ArrayList<Integer>();
    
    num3.addAll(num1);
        System.out.println("After adding num1 into num3: "+num3);   
    
    boolean n = num3.equals(num1);
        System.out.println("Are num3 AList and num1 Alist equal: "+n);
    
    ArrayList<Integer> num4 = new ArrayList<Integer>();
    num4.addAll(num3);
    num3.addAll(num2);
        System.out.println("After adding two Arraylist : "+num3);
////////////////////////////////////////////////////////////////////////////////

    ArrayList<Integer> number = new ArrayList<Integer>();
    
    number.add(20);
    number.add(6);
    number.add(87);
    number.add(76);
    number.add(16);
    number.add(96);
        System.out.println("Before sorting: "+number);
    Collections.sort(number);
        System.out.println("After sorting ascending order: "+number);
    Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sortimg in decending order: "+number);    
    }
}