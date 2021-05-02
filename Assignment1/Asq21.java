// 21. Write a Java program to convert a decimal number to octal number.
// Input Data:
// Input a Decimal Number: 15
// Expected Output
// Octal number is: 17
import java.util.*;


public class Asq21 {

    public static void main(String[] args) {

        int rem,n;
        String octal = "";
        char chars[] = { '0', '1', '2', '3', '4', '5', '6', '7' };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n= sc.nextInt();
        while (n > 0) {
            rem = n % 8;
            octal = chars[rem] + octal;
            n = n / 8;
        }
        System.out.println(octal);
    }
}
