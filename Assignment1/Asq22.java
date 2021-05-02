// 22. Write a Java program to convert a binary number to decimal number.
// Input Data:
// Input a binary number: 100
// Expected Output
// Decimal Number: 4

import java.util.*;

public class Asq22 {
    public static void main(String[] args) {

        int n, value = 0;
        System.out.print(("Enter binary number :-"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        int base = 1;

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;

            value += digit * base;

            base = base * 2;
        }
        System.out.println(value);
    }

}
