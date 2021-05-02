public class StarPattern9 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if(i<4){
                n--;
            }else{
                n++;
            }
            System.out.println();

        }
    }

}
