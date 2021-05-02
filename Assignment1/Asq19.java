// 19. Write a Java program to convert a decimal number to binary number.
// Input Data:
// Input a Decimal Number : 5
// Expected Output
// Binary number is: 101

import java.util.*;

public class Asq19 {
    public static void main(String args[]) {
        int b[] = new int[40];
        int in = 0;
        System.out.print("Enter a numer to convert it into binary :- ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();

        while (a > 0) {
            b[in++] = a % 2;
            a = a / 2;
        }
        for (int i = in - 1; i >= 0; i--) {
           System.out.print(b[i]);
        }

    }

}
