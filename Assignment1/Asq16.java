public class Asq16 {

    public static void main(String args[]) {
       // String s[] = { " +\"\"\"\"\"+ ", "[| o o |]", " |  ^  | ", " | '-' | ", " +-----+ " };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != 0 && j == 1 && i != 4 || i != 0 && j == 6 && i != 4) {
                    System.out.print("|");
                }
                if (i == 0 && j == 1 || i == 0 && j == 7) {
                    System.out.print("+");

                } else if (i == 0) {
                    if (j == 0 || j == 8) {
                        System.out.print(" ");
                    } else {
                        System.out.print("\"");
                    }
                } else if (i == 1) {
                    if (j == 0) {
                        System.out.print("[");
                    } else if (j == 6) {
                        System.out.print("]");
                    } else if (j == 2 || j == 4) {
                        System.out.print("o");
                    } else if (j != 2 || j != 4 || j != 6) {
                        System.out.print(" ");
                    }

                } else if (i == 2) {
                    if (j == 3) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");

                    }
                } else if (i == 3) {
                    if (j == 3) {
                        System.out.print("_");
                    } else if (j == 2 || j == 4) {
                        System.out.print("\'");
                    }else{
                        System.out.print(" ");
                    }
                } else if(i==4){
                    if (j==2||j==6) {
                        System.out.print("+");
                    }else if(j>2 &&j<6){
                        System.out.print("-");
                    }
                     else {
                        System.out.print(" ");

                    }

                }
            }
            System.out.println("");
        }

    }
}
