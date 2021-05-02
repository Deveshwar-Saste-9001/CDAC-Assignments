// 11. Write a Java program to print the area and perimeter of a circle.
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586

import java.lang.Math.*;

public class Asq11 {
    public static void main(String args[]) {

        double radius=7.5,pi;
        pi=Math.PI;

        System.out.println("Perimeter is = "+(2*pi*radius));
        System.out.println("Area is = "+(pi*radius*radius));
        
    }

}
