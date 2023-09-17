package start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Write_in_file {

    static Scanner in = new Scanner(System.in);
    static ArrayList<write> w = new ArrayList<write>();

    public static void main(String[] args) {
        System.out.println("Enter how many inputs:");
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
        System.out.println("Enter name: ");
        String name = in.next();
        System.out.println("Enter id: ");
        int id = in.nextInt();
        System.out.println("Enter age: ");
        int age = in.nextInt();
        write r = new write(name, id, age);
          w.add(r);
        
        }
        try {
            String fileName= "Writefood.txt";
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            for (write i : w) {
                os.writeObject(i);
            }
        } catch (IOException ex) {
            System.out.println("not found");
        }
        try {
            String fileName= "Writefood.txt";
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fileName));
            for (write i : w) {
                os.read();
                System.out.println();
            }
        } catch (IOException ex) {
            System.out.println("not found");
        }
        
    }
}

class write implements Serializable {

    String name;
    int id;
    int age;

    public write(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

}
