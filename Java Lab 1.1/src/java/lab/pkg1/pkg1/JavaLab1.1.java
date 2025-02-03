package java.lab.pkg1.pkg1;
import java.util.Scanner;

/* @author gvera14 */ 

public class JavaLab11 {

    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner giovanni = new Scanner(System.in);
        double num1, num2, num3, num4, num5;
        
        System.out.print("Enter number 1: ");
        num1 = giovanni.nextDouble();
        
        System.out.print("Enter number 2: ");
        num2 = giovanni.nextDouble();
        
        System.out.print("Enter number 3: ");
        num3 = giovanni.nextDouble();
        
        System.out.print("Enter number 4: ");
        num4 = giovanni.nextDouble();
        
        System.out.print("Enter number 5: ");
        num5 = giovanni.nextDouble();
        
        System.out.println("Highest: " + getHighest(num1, num2, num3, num4, num5));
        System.out.println("Lowest: " + getLowest(num1, num2, num3, num4, num5));
    }

    static double getHighest(double a, double b, double c, double d, double e) {
        return Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
    }

    static double getLowest(double a, double b, double c, double d, double e) {
        return Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
    }
}