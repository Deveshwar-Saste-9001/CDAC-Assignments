
public class Pattern2 {
    public static void main(String[] args) {
        int aaa = 65;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (aaa + j) +" ");
            }
            System.out.println("");
        }
    }

}
