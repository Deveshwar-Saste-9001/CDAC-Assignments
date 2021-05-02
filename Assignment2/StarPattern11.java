public class StarPattern11 {

    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j > n&&j<=(9-(4-i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            n++;
            System.out.println();
        }
    }
}
