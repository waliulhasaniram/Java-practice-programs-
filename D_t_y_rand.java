package start;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class D_t_y_rand {

    public static void main(String[] args) {
        
        Date date = new Date();
        
        DateFormat df = new SimpleDateFormat("dd-MM-YY");
        
        String currentDate = df.format(date);
        
        System.out.println("Current Date: "+currentDate);
          
//////////////////////////////////////////////////////////////////////////      
        LocalTime lt = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss");
        String currentTime = dtf.format(lt);
        System.out.println("Current Time : "+currentTime);
    
  /////////////////////////////////////////////////////////////////////////      
        Random rand = new Random();
        System.out.print("A random number: ");
        for (int i = 0; i <= 9; i++) {
           int rnum = rand.nextInt(6) +55;///...55 to 61
        System.out.print(rnum+" "); 
        }
        System.out.println();
        
        for (int i = 0; i < 10; i++) {
         double r =  Math.random()*10;
         System.out.printf("Random number: %.2f",r);
            System.out.println();
        }  
        
    } 
}
