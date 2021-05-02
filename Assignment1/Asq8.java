// 8. Write a Java program to display the following pattern.
// Sample Pattern :

public class Asq8 {
   

    static void A(int i, int n) {
        for (int j = 0; j <= 6; j++) {
            if (j == n || j == (6 - n) || (i == 4 / 2 && j > n && j < (6 - n)))
                System.out.printf("A");
            else
                System.out.printf(" ");
        }
    }

    public static void main(String args[]) {

        int n = 3, i, j, counter = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i == 3 && (j > 0 && j < 3))
                    System.out.print("J");
                else if ((j == 3 && i != 3) || (i > 1 && j == 0 && i != 3))
                    System.out.print("J");
                else
                    System.out.print(" ");
            }

            A(i, n);

            for (j = 0; j <= 6; j++) {
                if (j == counter || j ==7- counter - 1)
                    System.out.printf("V");
                else
                    System.out.printf(" ");
            }
            A(i,n);

            System.out.printf("\n");
            n--;
            counter++;
        }

    }
}