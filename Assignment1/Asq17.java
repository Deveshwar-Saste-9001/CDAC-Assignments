// 17. Write a Java program to add two binary numbers.
// Input Data:
// Input first binary number: 10
// Input second binary number: 11
// Expected Output
// Sum of two binary numbers: 101
import java.util.*;
public class Asq17 {
    public static void main(String args[]) {
        int b1, b2;
	int i = 0, carry = 0;
	int[] sum = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first binary number: ");
	b1 = sc.nextInt();
	System.out.print("Enter second binary number: ");
	b2 = sc.nextInt();
	while (b1 != 0 || b2 != 0) 
	{
		sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
		carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
		b1 = b1 / 10;
		b2 = b2 / 10;
	}
	if (carry != 0) {
		sum[i++] = carry;
	}
	--i;
	while (i >= 0) {
		System.out.print(sum[i--]);
	}
	System.out.print("\n");  
    }
    
}
