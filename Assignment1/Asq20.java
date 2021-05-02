// 20. Write a Java program to convert a decimal number to hexadecimal number.
// Input Data:
// Input a decimal number: 15
// Expected Output
// Hexadecimal number is : F
import java.util.*;

public class Asq20 {
    public static void main(String args[]) {
        
        int rem,n;  
        String hex="";   
        char chars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n= sc.nextInt();
       while(n>0)  
        {  
          rem=n%16;   
          hex=chars[rem]+hex;   
          n=n/16;  
        }  
        System.out.println(hex);
    }
    
}
