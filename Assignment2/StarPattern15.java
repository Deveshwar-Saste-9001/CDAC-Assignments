public class StarPattern15 {
    public static void main(String[] args) {
        int n=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j==0 || j==n || i==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            n++;
            System.out.println();
        }
    }
}
