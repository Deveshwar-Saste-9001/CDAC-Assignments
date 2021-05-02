public class Pyramid1 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j > n) {
                    System.out.print((i+1)+" ");
                } else {
                    System.out.print(" ");
                }
            }
            n--;
            System.out.println();
        }
    }

}
