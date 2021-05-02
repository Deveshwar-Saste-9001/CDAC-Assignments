
// 25. Write a Java program to convert a octal number to a decimal number.
// Input Data:
// Input any octal number: 10
// Expected Output
// Equivalent decimal number: 8
import java.util.*;

public class Asq25 {
    public static void main(String[] args) {
        int n, dec = 0, base = 1;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n > 0) {
            int dig = n % 10;
            dec = dec + dig * base;
            n = n / 10;
            base = base * 8;

        }
        System.out.println(dec);

    }

}
