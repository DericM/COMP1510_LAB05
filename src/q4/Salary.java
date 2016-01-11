package q4;


//************************************************************ 
// Salary.java 
// 
// Computes the amount of a raise and the new 
// salary for an employee. The current salary 
// and a performance rating (a String: "Excellent", 
// "Good" or "Poor") are input.
//************************************************************
import java.util.Scanner; 
import java.text.NumberFormat;
public class Salary {
    public static void main (String[] args) {
        
        final double excelent = 0.06;
        final double good = 0.04;
        final double poor = 0.015;
        
        // employee's current salary 
        //amount of the raise
        //new salary for the employee 
        // performance rating
        double currentSalary; 
        double raise;
        double newSalary; 
        String rating;
        
        //input
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the current salary: "); 
        currentSalary = scan.nextDouble(); 
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): "); 
        rating = scan.next();
        
        //Compute the raise using if ... 
        if(rating.equals("Excellent")){
            raise = currentSalary * excelent;
        } else{
            if(rating.equals("Good")){
                raise = currentSalary * good;
            }else{
                raise = currentSalary * poor;
            }
        }
            

        newSalary = currentSalary + raise; 
        
        
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance(); 
        System.out.println(); 
        System.out.println("Current Salary:" + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise)); 
        System.out.println("Your new salary: " + money.format(newSalary) ); 
        System.out.println();
    } 
}




