
// 23. Write a Java program to convert a binary number to hexadecimal number.
// Input Data:
// Input a Binary Number: 1101
// Expected Output
// HexaDecimal value: D
import java.util.*;

public class Asq23 {
    public static void main(String[] args) {
        int rem, binary, base = 1, n = 0;
        String hexa="";
        char chars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number :-");
        binary=in.nextInt();
        while (binary > 0) {
            int dig = binary % 10;
            n += dig * base;
            base = base * 2;
            binary = binary / 10;
        }

        while (n > 0) {
            rem = n % 16;
            hexa = chars[rem] + hexa;
            n = n / 16;

        }
        System.out.println(hexa);

    }

}
