public class Pyramid10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == (n-1) || i == 0) {
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
