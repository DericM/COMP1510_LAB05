/**
 * 
 */
package q1;

import java.util.Scanner;
/**
 * @author Deric
 *
 */
public class TestNames {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Name name1;
        Name name2;
        
        name1 = askName();
        name2 = askName();
        
        print(name1);
        print(name2);
        
        if(name1.equals(name2)){
            System.out.println("Identical Names!");
        }
        else{
            System.out.println("Different Names!");
        }
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static Name askName(){
        String first;
        String middle;
        String last;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Name:");
        first = scan.next();
        System.out.println("Enter middle Name:");
        middle = scan.next();
        System.out.println("Enter last Name:");
        last = scan.next();
        
        return new Name(first,middle,last);
    }
    
    public static void print(Name name){
        System.out.println("First Middle Last:" + name.firstMiddleLast());
        System.out.println("Last First Middle:" + name.lastFirstMiddle());
        System.out.println("Initials:" + name.initials());
        System.out.println("Length:" + name.length());
    }
}
