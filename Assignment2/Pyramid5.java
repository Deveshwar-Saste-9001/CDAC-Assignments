
public class Pyramid5 {

    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < 9; i++) {
            int cont = 0;
            for (int j = 0; j <= 18; j++) {
                if (j > n && j < (18 - (n))) {
                    System.out.print((cont));
                } else {
                    System.out.print(" ");
                }
                if (j < 9) {
                    cont++;
                } else {
                    cont--;
                }
            }
            n--;
            System.out.println();
        }
    }

}
