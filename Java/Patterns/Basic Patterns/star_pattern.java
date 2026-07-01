public class star_pattern {
    public static void main(String[] args){
        
        //number of lines 
        for(int i = 1; i<=4; i++){
            //number of stars per line
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
