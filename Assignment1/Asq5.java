
// 5. Write a Java program that takes two numbers as input and display the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125
import java.util.*;

public class Asq5 {
    public static void main(String args[]) {
        int a, b, c;
        System.out.print("Input first number:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.print("Input second number:");
        b = input.nextInt();
        input.close();
        c = a * b;
        System.out.println(a + " x " + b + " = " + c);

    }

}
