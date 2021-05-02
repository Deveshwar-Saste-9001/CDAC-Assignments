
// 24. Write a Java program to convert a binary number to a Octal number.
// Input Data:
// Input a Binary Number: 111
// Expected Output
// Octal number: 7
import java.util.*;

public class Asq24 {
    public static void main(String[] args) {

        int rem, n = 0, binary, base = 1;
        String octal = "";
        char chars[] = { '0', '1', '2', '3', '4', '5', '6', '7' };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Binary number:-");
        binary = input.nextInt();

        while (binary > 0) {
            int dig = binary % 10;
            n = n + dig * base;
            base = base * 2;
            binary = binary / 10;

        }

        while (n > 0) {
            rem = n % 8;
            octal = chars[rem] + octal;
            n = n / 8;
        }
        System.out.println(octal);

    }

}
