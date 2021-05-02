public class StarPattern16 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j==n ||j==4||i==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            n--;
            System.out.println();
        }
    }
    
}
