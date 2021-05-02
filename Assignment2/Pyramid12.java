public class Pyramid12 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j > n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            n++;
            System.out.println();
        }
    }

}
