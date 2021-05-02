// 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
//  8 x 3 = 24
// ...
// 8 x 10 = 80
import java.util.*;
public class Asq7 {
    public static void main(String args[]) {
        int a, c;
        System.out.print("Input a number:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            c = a * i;
            System.out.println(a + " x " + i + " = " + c);
        }

    }
}
