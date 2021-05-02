// 15. Write a Java program to swap two variables.

import java.util.*;

public class Asq15 {
    public static void main(String args[]) {

        int firstin, secondin;
        System.out.print("Input first number:");
        Scanner input = new Scanner(System.in);
        firstin = input.nextInt();
        System.out.print("Input second number:");
        secondin = input.nextInt();
        firstin = firstin + secondin;
        secondin = firstin - secondin;
        firstin = firstin - secondin;

        System.out.println("given number after swaping is " + firstin + " and " + secondin);

    }

}
