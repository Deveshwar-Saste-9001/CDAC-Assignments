public class Pyramid2 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < 9; i++) {
            int cont=0;
            for (int j = 0; j < 9; j++) {

                if (j > n) {
                    System.out.print((cont-n)+" ");
                } else {
                    System.out.print(" ");
                }
                cont++;
            }
            n--;
            System.out.println();
        }
    }

}
