public class pattern3 {
    public static void main(String[]agrs){
        int a,b,c;
        
        for ( a = 4; a >= 1; a--) {
            
            for ( b = 4; b > a; b--) {
                
                System.out.print(" ");
            }
            for ( c = 1; c < (a * 2); c++) {
                System.out.print(c);
                
            }
            
           System.out.println();
        }
}
}
