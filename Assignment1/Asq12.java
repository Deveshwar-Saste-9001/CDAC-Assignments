// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 import java.util.*;
public class Asq12 {
    public static void main(String args[]) {
        int input1, input2, input3, averageText;
        System.out.print("Input first number:");
        Scanner input = new Scanner(System.in);
        input1 = input.nextInt();
        System.out.print("Input second number:");
        input2 = input.nextInt();
        System.out.print("Input third number:");
        input3 = input.nextInt();
        averageText=(input1+input2+input3)/3;
        System.out.println("Avarage of "+input1+", "+input2+" and "+input3+" is "+averageText);
        
    }
    
}
