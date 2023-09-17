package start;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QUEUE {
 
   public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<Integer>();
        
      System.out.println("Enter who many numbers do you want: ");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int i = 0; i < n; i++){
           int x = in.nextInt();
           q.add(x);
       }
       
       System.out.println("The queue items: "+q);
       System.out.println("Polled item: "+q.poll());
       
       System.out.println("The queue items: "+q);
       System.out.println("Peeked item: "+q.peek());
       
       System.out.println("The queue items: "+q);
       q.add(23);
        System.out.println("The queue items: "+q.isEmpty());
     
////////////////////////////////////////////////////////////////////////////////
 LinkedList<Integer> L = new LinkedList<Integer>();
 
       System.out.println("Enter how many items you want for linkedlit: ");
       int m = in.nextInt();
       for (int i = 0; i < m; i++) {
          int y = in.nextInt();
           L.add(y);
       }
       System.out.println("Linked List: "+L); 
       System.out.println("Linked List 1st: "+L.getFirst()); 
       System.out.println("Linked List last: "+L.getLast()); 
        
       
    }
}