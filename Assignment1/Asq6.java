// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.*;

public class Asq6 {

    public static void main(String args[]) {
        int input1, input2, addtext, subtext, multtext, divtext, modtext;
        System.out.print("Input first number:");
        Scanner input = new Scanner(System.in);
        input1 = input.nextInt();
        System.out.print("Input second number:");
        input2 = input.nextInt();

       addtext= input1 + input2 ;
       subtext= input1 - input2 ;
       multtext= input1 * input2 ;
       divtext= input1 / input2 ;
       modtext= input1 % input2 ;

       System.out.println(input1+" + "+ input2+" = "+ addtext);
       System.out.println(input1+" - "+ input2+" = "+ subtext);
       System.out.println(input1+" x "+ input2+" = "+ multtext);
       System.out.println(input1+" / "+ input2+" = "+ divtext);
       System.out.println(input1+" mod "+ input2+" = "+ modtext);

    }

}
