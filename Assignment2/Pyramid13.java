public class Pyramid13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == n || j == (10 - (n)) || i == 5 && j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            n--;
            System.out.println();
        }
    }

}
