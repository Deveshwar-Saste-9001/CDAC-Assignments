public class Pattern18 {
    public static void main(String args[]) {
        int aaa=65;
        for(int i=0;i<5;i++){
            for(int j=4;j>=i;j--){
                System.out.print((char)(aaa+(4-j))+" ");
            }
            System.out.println();
        }
        
    }
    
}
