public class StarPattern7 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j > n && j < (9 - (n + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            if (i < 5) {
                n--;
            } else {
                n++;
            }
            System.out.println();
        }
    }
}