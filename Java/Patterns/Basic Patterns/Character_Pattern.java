public class Character_Pattern {
    public static void main(String[] args){
        int n = 4;
        char ch = 'A' +1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                //convert integert into character
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
